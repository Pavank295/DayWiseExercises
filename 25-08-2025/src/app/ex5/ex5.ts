import { Component } from '@angular/core';
import { ReactiveFormsModule, FormBuilder, Validators, FormGroup } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex5',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './ex5.html'
})
export class Ex5Component {
  fg: FormGroup;

  constructor(private fb: FormBuilder) {
    this.fg = this.fb.group({
      fName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]]
    });
  }

  onSubmit() {
    if (this.fg.valid) {
      alert('✅ Form submitted!\n' + JSON.stringify(this.fg.value, null, 2));
    }
  }
}

