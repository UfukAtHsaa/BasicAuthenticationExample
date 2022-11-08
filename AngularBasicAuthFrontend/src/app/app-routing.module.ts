import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LectureComponent } from "./lecture/lecture.component";
import {LoginComponent} from "./login/login.component";
import {LectureDetailComponent} from "./lecture-detail/lecture-detail.component";
import {LogoutComponent} from "./logout/logout.component";

const routes: Routes = [
  { path: 'login', component: LoginComponent, pathMatch: "full" },
  { path: '', component: LoginComponent },
  { path: 'lecture', component: LectureComponent },
  { path: 'detail/:id', component: LectureDetailComponent },
  { path: 'logout', component: LogoutComponent },
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot( routes )
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
