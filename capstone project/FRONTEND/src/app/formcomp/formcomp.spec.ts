import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Formcomp } from './formcomp';

describe('Formcomp', () => {
  let component: Formcomp;
  let fixture: ComponentFixture<Formcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Formcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Formcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});