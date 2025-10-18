
<<<<<<< HEAD
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavBarComponent implements OnInit {

  constructor() { }

  role:string|null;
  ngOnInit(): void {
    console.log(localStorage.getItem("role"));
    this.role=localStorage.getItem("role");
  }
=======
export class NavBarComponent{

  
>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484

}
