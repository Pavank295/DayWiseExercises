import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex5 } from './ex5';

describe('Ex5', () => {
  let component: Ex5;
  let fixture: ComponentFixture<Ex5>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex5]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex5);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
