import { Component } from '@angular/core';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  course1 = {
    id:1,
    name:'Angular',
    code:'ANG101',
    credits:4
  };

  course2 = {
    id:2,
    name:'Java',
    code:'JAVA201',
    credits:3
  };

  course3 = {
    id:3,
    name:'Spring Boot',
    code:'SPR301',
    credits:4
  };

}