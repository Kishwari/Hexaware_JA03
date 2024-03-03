import { Injectable } from '@angular/core';
import { User } from './user';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() {
    console.log('user service object created');

  }
  //user array object 
  users: User[] = [{ "uid": 101, "username": "Boney", "email": "boney@example.com", "address": "Chennai" },
  { "uid": 102, "username": "Tom", "email": "tom@example.com", "address": "Pune" },
  { "uid": 103, "username": "Satish", "email": "satish@example.com", "address": "Delhi" },
  { "uid": 104, "username": "King", "email": "bonkingey@example.com", "address": "Noida" }
  ];

  getAllUsers() {
    console.log('getAllUsers() called');
    return this.users;
  }
}
