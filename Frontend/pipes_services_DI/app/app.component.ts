import { Component } from '@angular/core';
import { UserService } from './user.service';
import { User } from './user';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
  //providers:[UserService]
})
export class AppComponent {
  title = 'webapp';

  object: Object = { foo: 'bar', baz: 'qux', nested: { xyz: 3, numbers: [1, 2, 3, 4, 5] } };
  userList: User[] = [];
  constructor(private userService: UserService) {

    console.log("component class obj created");
  }
  ngOnInit(): void {
    console.log('ngOnInit is called');
    this.getAll();
  }
  getAll() {
    this.userList = this.userService.getAllUsers();
  }
}
