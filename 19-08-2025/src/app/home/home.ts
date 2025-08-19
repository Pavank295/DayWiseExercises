import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TaskFormComponent } from '../task-form/task-form';
import { TaskListComponent } from '../task-list/task-list';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, TaskFormComponent, TaskListComponent],
  templateUrl: './home.html'
})
export class HomeComponent {
  categories = ['Work', 'Personal', 'Shopping'];
  tasks: { title: string; category: string }[] = [];

  onAddTask(task: { title: string; category: string }) {
    this.tasks.push(task);
  }

  onDeleteTask(index: number) {
    this.tasks.splice(index, 1);
  }
}





