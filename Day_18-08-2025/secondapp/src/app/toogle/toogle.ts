import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-toogle',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './toogle.html',
  styleUrl: './toogle.css'
})
export class Toogle {
  countrylist: string[] = ['India', 'USA', 'UK', 'Australia', 'Canada'];
  contriesToDisplay: string[] = [];
  loadcountries(){
    this.contriesToDisplay = this.countrylist;
  }


}
