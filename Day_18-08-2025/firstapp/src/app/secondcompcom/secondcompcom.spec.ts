import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Secondcompcom } from './secondcompcom';

describe('Secondcompcom', () => {
  let component: Secondcompcom;
  let fixture: ComponentFixture<Secondcompcom>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Secondcompcom]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Secondcompcom);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
