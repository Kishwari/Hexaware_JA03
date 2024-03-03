import { Component } from '@angular/core';
import { Car } from '../../models/car';
import { CarService } from '../../services/car.service';

@Component({
  selector: 'app-get-car',
  templateUrl: './get-car.component.html',
  styleUrls: ['./get-car.component.css']
})
export class GetCarComponent {

  carList: Car[] = [];
  constructor(private carService: CarService) {

  }
  getAllCars() {

    this.carService.getAll()
      .subscribe(
        (cars) => {
          this.carList = cars
          console.log(cars);
        });
  }
  getCarById(carId:number){
    this.carService.getById(carId)
    .subscribe(
      (cars) => {
        this.carList = cars
        console.log(cars);
      });
  }


}
