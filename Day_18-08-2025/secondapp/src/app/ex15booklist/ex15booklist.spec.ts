import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex15booklist } from './ex15booklist';

describe('Ex15booklist', () => {
  let component: Ex15booklist;
  let fixture: ComponentFixture<Ex15booklist>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex15booklist]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex15booklist);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
