import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SummaryComp } from './summary-comp';

describe('SummaryComp', () => {
  let component: SummaryComp;
  let fixture: ComponentFixture<SummaryComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SummaryComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SummaryComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});