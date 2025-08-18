import { bootstrapApplication } from '@angular/platform-browser';
import { Secondcompcom } from './app/secondcompcom/secondcompcom';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Login } from './app/login/login';
import { Welcome } from './app/welcome/welcome';

bootstrapApplication(Welcome, appConfig)
  .catch((err) => console.error(err));
