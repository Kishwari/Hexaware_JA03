import { Component } from '@angular/core';
import { Car } from '../../models/car';
import { CarService } from '../../services/car.service';

@Component({
  selector: 'app-update-car',
  templateUrl: './update-car.component.html',
  styleUrls: ['./update-car.component.css']
})
export class UpdateCarComponent {

  constructor(private carService: CarService) { }

  updateCar(data: Car) {

    this.carService.updateCar(data);

  }
}
