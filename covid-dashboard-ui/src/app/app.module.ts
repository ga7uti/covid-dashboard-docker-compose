import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule } from '@angular/forms'
import { HomeComponent } from './components/home/home.component';
import { ViewComponent } from './components/view/view.component';
import { CovidDataComponent } from './components/covid-data/covid-data.component';
import { DailyVaccineDataComponent } from './components/daily-vaccine-data/daily-vaccine-data.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { HeaderComponent } from './components/header/header.component';
import { NumberSystemPipe } from './pipe/number-system.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ViewComponent,
    CovidDataComponent,
    DailyVaccineDataComponent,
    SidebarComponent,
    HeaderComponent,
    NumberSystemPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports:[NumberSystemPipe]
})
export class AppModule { }
