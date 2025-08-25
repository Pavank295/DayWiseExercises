import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { Ex5Component } from './app/ex5/ex5';

bootstrapApplication(Ex5Component, appConfig)
  .catch(err => console.error(err));
