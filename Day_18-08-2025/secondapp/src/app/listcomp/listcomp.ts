import { Component } from '@angular/core';

@Component({
  selector: 'app-listcomp',
  standalone: true,
  imports: [],
  templateUrl: './listcomp.html',
  styleUrl: './listcomp.css'
})
export class Listcomp {
  fruitslist: string[] = ['Apple', 'Banana', 'Cherry', 'Date', 'Elderberry'];

}
