import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DailyVaccineDataComponent } from './daily-vaccine-data.component';

describe('DailyVaccineDataComponent', () => {
  let component: DailyVaccineDataComponent;
  let fixture: ComponentFixture<DailyVaccineDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DailyVaccineDataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DailyVaccineDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
