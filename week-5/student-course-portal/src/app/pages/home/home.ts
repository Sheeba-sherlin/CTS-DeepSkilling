
import { FormsModule } from '@angular/forms';
import { Component, OnInit, OnDestroy } from '@angular/core';
@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})

export class Home implements OnInit, OnDestroy {

  portalName = 'Student Course Portal';

  isPortalActive = true;

  message = '';

  searchTerm = '';

  courseCount = 0;

  // Property Binding [property]:
  // One-way binding from Component → HTML element.

  // Two-Way Binding [(ngModel)]:
  // Data flows both ways:
  // Component ↔ HTML element.

  onEnrollClick() {
    this.message = 'Enrollment opened!';
  }
  ngOnDestroy(): void {
  console.log('HomeComponent destroyed');
}

  ngOnInit(): void {
    this.courseCount = 12;
    console.log('HomeComponent initialised — courses loaded');
  }
  

}