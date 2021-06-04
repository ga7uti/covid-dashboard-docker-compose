import { Component, OnInit } from '@angular/core';
import { Country } from 'src/app/models/country';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  countryList: Country[] = [];
  filterCountryList: Country[] = [];
  search: string = ''
  constructor(private dataService: DataService) {
    this.getCountryFlagData()
  }

  ngOnInit(): void {
  }

  getCountryFlagData() {
    this.dataService.getCountryFlagData().subscribe(data => {
      this.countryList = data
      this.filterCountryList = this.countryList
    })
  }

  filterCountry() {
    this.filterCountryList = []
    this.filterCountryList = this.countryList.filter(data => {
      return data.name?.toLowerCase().includes((this.search.toLowerCase()))
    })
  }
}
