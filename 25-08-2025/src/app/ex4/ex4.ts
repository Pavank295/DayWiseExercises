import { Component, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormBuilder, Validators } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-ex4',
  standalone: true,
  templateUrl: './ex4.html',
  styleUrls: ['./ex4.css'],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule,
    MatButtonModule
  ]
})
export class Ex4Component {
  private fb = inject(FormBuilder);

  subjects = ['Computer Science', 'Mathematics', 'Physics', 'Chemistry', 'Biology'];

  regForm = this.fb.group({
    name: ['', [Validators.required, Validators.minLength(2)]],
    email: ['', [Validators.required, Validators.email]],
    dob: [null as Date | null, Validators.required],
    subject: ['', Validators.required]
  });

  get nameCtrl() { return this.regForm.get('name'); }
  get emailCtrl() { return this.regForm.get('email'); }
  get dobCtrl() { return this.regForm.get('dob'); }
  get subjectCtrl() { return this.regForm.get('subject'); }

  onSubmit() {
    if (this.regForm.valid) {
      alert('✅ Registration Successful!\n' + JSON.stringify(this.regForm.value, null, 2));
    }
  }
}
