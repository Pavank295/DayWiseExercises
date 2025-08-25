import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormControl } from '@angular/forms';
import { map, startWith } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-ex3',
  standalone: true,
  templateUrl: './ex3.html',
  styleUrls: ['./ex3.css'],
  imports: [CommonModule, ReactiveFormsModule],
})
export class Ex3Component {
  inputCtrl = new FormControl<string>('', { nonNullable: true });

  reversed$: Observable<string> = this.inputCtrl.valueChanges.pipe(
    startWith(this.inputCtrl.value),
    map(v => v.split('').reverse().join(''))
  );
}
