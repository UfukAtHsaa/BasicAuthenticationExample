import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LectureComponent } from './lecture/lecture.component';
import { LectureDetailComponent } from './lecture-detail/lecture-detail.component';
import {FormsModule} from "@angular/forms";
import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './login/login.component';
import { HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import { MessagesComponent } from './messages/messages.component';
import {HttpInterceptorService} from "./httpInterceptor.service";
import {LogoutComponent} from "./logout/logout.component";

@NgModule({
  declarations: [
    AppComponent,
    LectureComponent,
    LectureDetailComponent,
    LoginComponent,
    LogoutComponent,
    MessagesComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: HttpInterceptorService,
      multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
