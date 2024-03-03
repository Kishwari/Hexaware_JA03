import { createAction, props } from '@ngrx/store';
import { Car } from 'src/app/models/car.model';




export const addCarAction = createAction(
    '[Cars] Add Car',
    props<{ car: Car }>()
)

export const toggleCarAction = createAction(
    '[Cars] Toggle Car',
    props<{ id: string }>()
)


export const removeCarAction = createAction(
    '[Cars] Remove Car',
    props<{ id: string }>()
)