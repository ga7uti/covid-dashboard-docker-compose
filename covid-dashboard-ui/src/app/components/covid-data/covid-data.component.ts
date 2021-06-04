import { Component, Input, OnInit } from '@angular/core';
import { CovidVaccine } from 'src/app/models/covid-vaccine';

@Component({
  selector: 'app-covid-data',
  templateUrl: './covid-data.component.html',
  styleUrls: ['./covid-data.component.css']
})
export class CovidDataComponent implements OnInit {

  @Input("covidvaccine") covidVaccine: CovidVaccine = new CovidVaccine();
  constructor() {
  }

  ngOnInit(): void {
  }

}
