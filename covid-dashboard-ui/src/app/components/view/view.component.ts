import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Country } from 'src/app/models/country';
import { CovidVaccine } from 'src/app/models/covid-vaccine';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  covidVaccine: CovidVaccine = new CovidVaccine();
  dailyVaccineList: CovidVaccine[] = [];
  countryList: Country[] = []
  country: String = '';

  constructor(private dataService: DataService,
    private router: ActivatedRoute) {
    this.router.params.subscribe(params => {
      this.getCovidVaccineData(params["country"])
      this.country = params["country"]
    })
  }

  ngOnInit(): void {
  }

  getCovidVaccineData(country: String) {
    this.dataService.getCovidData(country).subscribe(data => {
      this.covidVaccine = data[data.length - 1];
      this.dailyVaccineList = data;
    })
  }
}
