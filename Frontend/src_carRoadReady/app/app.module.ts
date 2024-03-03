import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { UpdateCarComponent } from './components/update-car/update-car.component';
import { AddCarComponent } from './components/add-car/add-car.component';
import { GetCarComponent } from './components/get-car/get-car.component';
import { DeleteCarComponent } from './components/delete-car/delete-car.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { SearchComponent } from './components/search/search.component';
@NgModule({
  declarations: [
    AppComponent,

    UpdateCarComponent,
    AddCarComponent,
    GetCarComponent,
    DeleteCarComponent,
    DashboardComponent,
    SearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
