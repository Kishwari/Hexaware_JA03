import { Component } from '@angular/core';
import { Car } from '../../models/car';
import { CarService } from '../../services/car.service';

@Component({
  selector: 'app-add-car',
  templateUrl: './add-car.component.html',
  styleUrls: ['./add-car.component.css']
})
export class AddCarComponent {

  constructor(private carService: CarService) { }

  addCar(data: Car) {
    console.log(data);
    this.carService.insertCar(data);

  }
}
