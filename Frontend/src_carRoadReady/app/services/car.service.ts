import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Car } from '../models/car';
@Injectable({
  providedIn: 'root'
})
export class CarService {

  constructor(private http: HttpClient) { }

  baseUrl = 'http://localhost:8080/roadready/cars/';

  getAll(): Observable<Car[]> {

    return this.http.get<Car[]>(this.baseUrl+"getAllCars");

  }

  insertCar(body: Car) {

    console.log(body);

    return this.http.post<Car>(this.baseUrl+"addCar",body);

  }
  updateCar(body: Car) {
    return this.http.put<Car>(this.baseUrl+"updateCarDetails",body);

   // this._http.post<Car>(this.baseUrl, car)
     // .subscribe((response) => { console.log('car updated', response) })

  }

  deleteCarById(id:number):Observable<string>{

    return  this.http.delete<string>(this.baseUrl+`deleteCarById/${id}`);

  }
      //this._http.delete<Car>(this.baseUrl + id)
       // .subscribe((data) => { console.log(id + "record deleted"); }, err => { console.log(err) });

       find(data:string):Observable<Car[]>{


        console.log(data)
       return this.http.get<Car[]>(this.baseUrl+`getCarById/${data}`);
  
      }
      getById(carId:number):Observable<Car[]>{
        console.log(carId);
return this.http.get<Car[]>(this.baseUrl+`getCarById/${carId}`);


      }
    
  }
  


