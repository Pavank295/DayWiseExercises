import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-success-comp',
  imports: [],
  templateUrl: './success-comp.html',
  styleUrl: './success-comp.css'
})
export class SuccessComp {
  constructor(private router: Router){}

  home(){
    this.router.navigate(['/home'])
  }
}
