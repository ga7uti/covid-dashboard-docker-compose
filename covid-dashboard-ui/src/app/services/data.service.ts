import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) {
  }

  getCountryFlagData(): Observable<any> {
    return this.http.get(environment.country_url+"/country")
  }

  getCovidData(iso:String):Observable<any>{
    return this.http.get(environment.base_url+"/covidvaccine?iso="+iso.toUpperCase())
  }
}
