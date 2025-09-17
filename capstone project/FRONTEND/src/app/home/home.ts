import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { map, Observable, startWith } from 'rxjs';

@Component({
  selector: 'app-home',
  imports: [FormsModule,CommonModule,ReactiveFormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  src: string = '';
  dst: string = '';
  date: string = '';

  constructor(private router: Router) {}

  onSearch() {
    if (this.src && this.dst && this.date) {
      this.router.navigate(['/flights'], {
        queryParams: { src: this.src, dst: this.dst, date: this.date }
      });
    }
  }

  swapLocations() {
    const temp = this.src;
    this.src = this.dst;
    this.dst = temp;
  }
}