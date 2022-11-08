import { Component, OnInit, Input } from '@angular/core';
import { Lecture } from '../lecture';
import {ActivatedRoute} from "@angular/router";
import {LectureService} from "../lecture.service";
import {Location} from "@angular/common";
import {LectureDetail} from "../lectureDetail";

@Component({
  selector: 'app-lecture-detail',
  templateUrl: './lecture-detail.component.html',
  styleUrls: ['./lecture-detail.component.css']
})
export class LectureDetailComponent implements OnInit {

  lecture: LectureDetail | undefined;

  constructor(
    private route: ActivatedRoute,
    private lectureService: LectureService,
    private location: Location
  ) { }

  ngOnInit(): void {
    this.getLecture()
  }

  getLecture(): void {
    const id = String(this.route.snapshot.paramMap.get('id'));
    this.lectureService.getLecture(id)
      .subscribe(
        lecture =>
          this.lecture = lecture
      );
  }

  goBack(): void {
    this.location.back();
  }

}
