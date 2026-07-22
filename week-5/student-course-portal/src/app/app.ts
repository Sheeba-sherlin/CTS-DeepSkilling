import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { Header } from './components/header/header';
import { Home } from './pages/home/home';
import { CourseList } from './pages/course-list/course-list';
imports:[
    RouterOutlet,
    Header,
    Home,
    CourseList
]
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    Header,
    Home
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {}