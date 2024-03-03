import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { StoreModule } from '@ngrx/store';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarsReducer } from './store/reducers/car.reducer';
import { TodoListComponent } from './components/car-list/car-list.component';
@NgModule({
  declarations: [
    AppComponent,
    TodoListComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    StoreModule.forRoot({ cars: CarsReducer }),
    StoreDevtoolsModule.instrument({
      maxAge: 25

    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
