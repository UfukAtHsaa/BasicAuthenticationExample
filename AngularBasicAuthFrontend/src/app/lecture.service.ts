import { Injectable } from '@angular/core';
import { Lecture } from './lecture';
import {Observable, of} from "rxjs";
import { MessageService } from './message.service';
import {HttpClient} from "@angular/common/http";
import {LectureDetail} from "./lectureDetail";

@Injectable({
  providedIn: 'root'
})
export class LectureService {

  private lectureUrl = 'http://localhost:8080/public/v1/lecture';  // URL to web api
  private lecturePrivateDetailUrl = 'http://localhost:8080/private/v1/lecture/';  // URL to web api

  constructor(
    private messageService: MessageService,
    private httpClient : HttpClient
  ) { }

  private log(message: string) {
    this.messageService.add(`LectureService: ${message}`);
  }

  getLectures(): Observable<Lecture[]> {

    return this.httpClient.get<Lecture[]>(this.lectureUrl)
  }

  getLecture(id: string): Observable<LectureDetail> {

    let url = this.lecturePrivateDetailUrl + id;
    let lectureDetailObservable = this.httpClient.get<LectureDetail>(url);
    return lectureDetailObservable;
  }
}
