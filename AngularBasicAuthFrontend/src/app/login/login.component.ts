import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AuthenticationService } from './auth.service';
import {MessageService} from "../message.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: string;
  password : string;
  errorMessage = 'Invalid Credentials';
  successMessage: string;
  invalidLogin = false;
  loginSuccess = false;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: AuthenticationService,
    private messageService: MessageService
  ) {
    this.username = "";
    this.password = "";
    this.successMessage = "";
  }

  ngOnInit() {
    if (this.authenticationService.isUserLoggedIn()) {
      this.messageService.add("user is logged in")
      this.router.navigate(['/lecture']);
    }
  }

  handleLogin() {
    this.authenticationService.authenticationService(this.username, this.password).subscribe((result)=> {
      this.invalidLogin = false;
      this.loginSuccess = true;
      this.successMessage = 'Login Successful.';
      this.router.navigate(['/lecture']);
    }, () => {
      this.invalidLogin = true;
      this.loginSuccess = false;
    });
  }
}
