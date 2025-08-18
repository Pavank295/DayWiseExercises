import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Listcomp } from './app/listcomp/listcomp';
import { Toogle } from './app/toogle/toogle';
import { Switchdemo } from './app/switchdemo/switchdemo';
import { Ex15booklist } from './app/ex15booklist/ex15booklist';

bootstrapApplication(Ex15booklist, appConfig)
  .catch((err) => console.error(err));
