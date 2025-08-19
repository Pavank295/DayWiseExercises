import { Component, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-task-list',
  standalone: true,
  imports: [CommonModule],
  template: `
    <ul>
      <li *ngFor="let task of tasks; let i = index">
        {{ task.title }} ({{ task.category }})
        <button (click)="deleteTask.emit(i)">Delete</button>
      </li>
    </ul>
  `
})
export class TaskListComponent {
  @Input() tasks: { title: string; category: string }[] = [];
  @Output() deleteTask = new EventEmitter<number>();
}

