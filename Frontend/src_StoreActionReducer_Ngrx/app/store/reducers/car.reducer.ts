
import { createReducer, on } from '@ngrx/store'
import { Car } from 'src/app/models/car.model';
import { addCarAction, toggleCarAction, removeCarAction } from '../actions/car.action';
export interface TCarState {

  cars: Car[];
}
export const initialState: TCarState = {

  cars: [
    {
      
      id: '',
      make: '',
      model: '',
      carStatus: '',
      location: '',
      specification: '',

    }
  ]
}
export const CarsReducer = createReducer(

  initialState,
  on(addCarAction, (state, { car }) => ({

    ...state,
    cars: [...state.cars, car]
  })),
  on(removeCarAction, (state, { id }) => ({

    ...state,
    cars: state.cars.filter((car) => { return car.id !== id })
    //todos:state.todos.forEach( (todo) => { if(todo.id === id){  } } )

  })),
  /*on(toggleCarAction, (state, { id }) => ({
    ...state,
    cars: state.cars.map((car) => (car.id === id ? { ...car, completed: !car.completed } : car)),
  }))*/
);