import { Component } from '@angular/core';
import { User } from './model/User';


@Component({
  selector: 'app-root',
  templateUrl: './notFound.component.html',
  styleUrls: ['./notFound.component.css']
})
export class AppComponent {
  user: User;

  loginUser(login: string, password: string){
    this.user.login=login;
    this.user.password=password;
  }
}
