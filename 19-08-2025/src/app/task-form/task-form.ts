import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task-form',
  standalone: true,
  imports: [CommonModule, FormsModule],
  template: `
    <div>
      <input [(ngModel)]="taskTitle" placeholder="Task title" />
      <select [(ngModel)]="taskCategory">
        <option *ngFor="let cat of categories" [value]="cat">{{ cat }}</option>
      </select>
      <button (click)="onAddTask()">Add</button>
    </div>
  `
})
export class TaskFormComponent {
  @Input() categories: string[] = [];
  @Output() taskAdded = new EventEmitter<{ title: string; category: string }>();

  taskTitle: string = '';
  taskCategory: string = '';

  onAddTask() {
    if (this.taskTitle && this.taskCategory) {
      this.taskAdded.emit({ title: this.taskTitle, category: this.taskCategory });  
      this.taskTitle = '';
      this.taskCategory = '';
    }
  }
}
