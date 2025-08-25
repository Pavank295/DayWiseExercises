import { Component, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormBuilder, Validators } from '@angular/forms';
import { MatStepperModule } from '@angular/material/stepper';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-ex2',
  standalone: true,
  templateUrl: './ex2.html',  
  styleUrls: ['./ex2.css'],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MatStepperModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule
  ]
})
export class Ex2Component {
  title = 'User Details (Stepper)';

  private fb = inject(FormBuilder);

  nameForm = this.fb.group({
    name: ['', [Validators.required, Validators.minLength(2)]]
  });

  ageForm = this.fb.group({
    age: [null as number | null, [Validators.required, Validators.min(1), Validators.max(120)]]
  });

  emailForm = this.fb.group({
    email: ['', [Validators.required, Validators.email]]
  });

  onSubmit() {
    alert(
      `Submitted:\nName: ${this.nameForm.value.name}\nAge: ${this.ageForm.value.age}\nEmail: ${this.emailForm.value.email}`
    );
  }
}
