import { Component } from '@angular/core';
import { Car } from '../../models/car';
import { CarService } from '../../services/car.service';

@Component({
  selector: 'app-delete-car',
  templateUrl: './delete-car.component.html',
  styleUrls: ['./delete-car.component.css']
})
export class DeleteCarComponent {

  carList: Car[] = [];
  constructor(private carService: CarService) {

  }
  deleteById(id: number) {

    this.carService.getAll().subscribe((list)=>{this.carList=list;console.log(list)});
    this.carService.deleteCarById(id);

  }
}
