import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { Car } from 'src/app/models/car.model';
import { addCarAction, toggleCarAction, removeCarAction } from 'src/app/store/actions/car.action';

@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css']
})
export class TodoListComponent {

  newid!:string;
  newmake!: string;
  newmodel!: string;
  newcarStatus!: string;
  newlocation!: string;
  newspecification!: string;

  carsList!: Car[];

  constructor(private store: Store<{ cars: { cars: Car[] } }>) {

    store.select('cars').subscribe((TCarState: { cars: Car[] }) => {

      this.carsList = TCarState.cars;

      console.log(this.carsList);

    })

  }

  addCar() {

    if (this.newid.trim() === ''||this.newmake.trim() === ''||this.newmodel.trim() === ''||
    this.newcarStatus.trim() === ''||
    this.newlocation.trim() === ''||
    this.newspecification.trim() === '' ) {


      return;

    }

    const car: Car = {

      
      id: this.newid,
      make:this.newmake,
      model: this.newmodel,
      carStatus: this.newcarStatus,
      location: this.newlocation,
      specification: this.newspecification,
    }

    this.store.dispatch(addCarAction({ car }));
     this.newid='';
    this.newmake='';
     this.newmodel='';
    this.newcarStatus='';
     this.newlocation='';
     this.newspecification='';

  }

  toggleCar(id: string) {

    this.store.dispatch(toggleCarAction({ id }));

  }

  removeCar(id: string) {

    this.store.dispatch(removeCarAction({ id }));

  }


}

