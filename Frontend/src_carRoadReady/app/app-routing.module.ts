import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AddCarComponent } from './components/add-car/add-car.component';
import { GetCarComponent } from './components/get-car/get-car.component';
import { SearchComponent } from './components/search/search.component';
import { UpdateCarComponent } from './components/update-car/update-car.component';
import { DeleteCarComponent } from './components/delete-car/delete-car.component';

const routes: Routes = [
  {path:'home',component:DashboardComponent},
    {path:'addcar',component:AddCarComponent},
    {path:'displayall',component:GetCarComponent},
    {path:'search/:input',component:SearchComponent},
    {path:'update/:id',component:UpdateCarComponent},
    {path:'delete/:id',component:DeleteCarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

