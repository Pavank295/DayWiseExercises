import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-switchdemo',
  imports: [FormsModule,CommonModule],
  templateUrl: './switchdemo.html',
  styleUrl: './switchdemo.css'
})
export class Switchdemo {
  searchText: string = '';
  allNames: string[] = ['jack', 'jac', 'Vishnu', 'sita', 'Rani', 'Ranisha'];
  get filteredNames(): string[] {
    const search = this.searchText.toLowerCase();
    return this.allNames.filter(name => name.toLowerCase().includes(search));
  }

}
