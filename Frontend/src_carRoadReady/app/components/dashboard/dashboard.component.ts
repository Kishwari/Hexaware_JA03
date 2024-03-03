import { Component } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Car } from 'src/app/models/car';
import { CarService } from 'src/app/services/car.service';
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

   

    data:string = '';

    constructor(private carService:CarService,private router:Router){}
   
      find(searchData:any){

          this.router.navigate(['/search/'+searchData.form.value.data])

          console.log(searchData.form.value.data);
          

      }




}
