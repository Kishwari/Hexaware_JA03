import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Car } from 'src/app/models/car';
import { CarService } from 'src/app/services/car.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit{

  carSearchList:Car[] =[];

    constructor(private route:ActivatedRoute, private carService:CarService){}
 
    ngOnInit(): void {
     
      this.find();
  }
   
     searchInput:string = '';

    find(){

          // Here we search employees records , whose salary is greater than input = 15000 or input = 50000

        this.route.params.subscribe( (param)=>{ this.searchInput = param['input']});

        this.carService.find(this.searchInput).subscribe( (list)=> {this.carSearchList = list;console.log('list '+list)});
       
        console.log('searched data '+this.carSearchList);

    }

    

}
