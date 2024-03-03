import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Player } from './Model/player';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  constructor(private http: HttpClient) { }

  baseUrl = 'http://localhost:8080/api/player';


  getAll(): Observable<Player[]> {

    return this.http.get<Player[]>(this.baseUrl+`/getall`);

  }


  deletePlayerByJerseyNumber(jerseyNumber: number) {


   return  this.http.delete<Player>(this.baseUrl+`/deletebyJerseyNumber/${jerseyNumber}`);

  }

  
}
