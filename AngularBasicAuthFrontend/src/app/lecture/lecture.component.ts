import { Component, OnInit } from '@angular/core';
import { Lecture } from "../lecture";
import { LectureService } from "../lecture.service";
import {MessageService} from "../message.service";

@Component({
  selector: 'app-lecture',
  templateUrl: './lecture.component.html',
  styleUrls: ['./lecture.component.css']
})
export class LectureComponent implements OnInit {

  lectures: Lecture[] = [];

  constructor(private lectureService: LectureService, private messageService: MessageService) { }

  ngOnInit(): void {
    this.getLectures();
  }

  getLectures(): void {
    this.lectureService.getLectures()
      .subscribe(heroes => this.lectures = heroes);
  }
}
