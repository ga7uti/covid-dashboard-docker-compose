import { Component, ElementRef, Input, OnInit, ViewChild } from '@angular/core';
import { Chart, LineController, LineElement, PointElement, LinearScale, Title, CategoryScale } from 'chart.js';
import { CovidVaccine } from 'src/app/models/covid-vaccine';

@Component({
  selector: 'app-daily-vaccine-data',
  templateUrl: './daily-vaccine-data.component.html',
  styleUrls: ['./daily-vaccine-data.component.css']
})
export class DailyVaccineDataComponent implements OnInit {

  @Input("dailyVaccineList") dailyVaccineList: CovidVaccine[] = []
  @ViewChild('canvas') canvas: ElementRef;

  dates: String[] = []
  numberOfVaccines: number[] = []
  chart: Chart;

  constructor() {
    Chart.register(LineController, LineElement, PointElement, LinearScale, Title, CategoryScale);
  }

  ngOnInit(): void {

  }

  ngAfterViewInit() {
    this.dates = this.dailyVaccineList.map(item => item.date.toString())
    this.numberOfVaccines = this.dailyVaccineList.map(item => Number.parseInt(item.dailyVaccinations.toString()))
    console.log(this.dailyVaccineList, this.dates, this.numberOfVaccines)
    this.chart = new Chart(this.canvas.nativeElement.getContext('2d'), {
      type: 'line',
      data: {
        labels: this.dates.slice(this.dates.length - 30, this.dates.length),
        datasets: [
          {
            data: this.numberOfVaccines.slice(this.numberOfVaccines.length - 30, this.numberOfVaccines.length),
            borderColor: 'rgb(75, 192, 192)',
          },
        ]
      },
      options: {
        responsive: true,
        plugins: {
          legend: {
            position: 'top',
          },
          title: {
            display: true,
            text: 'Daily Vaccination Chart'
          }
        }, scales: {
          x: {
            display: true,
            title: {
              display: true,
              text: 'Date'
            }
          },
          y: {
            display: true,
            title: {
              display: true,
              text: 'Daily Vaccinations'
            }
          }
        }
      }
    });
  }

}
