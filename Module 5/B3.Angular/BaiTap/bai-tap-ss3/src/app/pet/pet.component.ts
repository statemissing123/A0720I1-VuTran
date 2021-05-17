import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.scss']
})
export class PetComponent implements OnInit {

  petName = 'puppie';
  petImage = 'https://lh3.googleusercontent.com/proxy/JYJbTzByK2HaEgUH9uGr6p3e3C5hEhym_g-TA6ebdPrIZ85dwUQzx4AYeqaN9esp6sceq4rHLPct6_Y1jykiAGOm9rrikS40jEJOAwCTF74vp9yB3KBSKKNomuRcDS3Oi3O6BFBRnVOYri9wZHri5fD-650zGpcI4YemEDGzG2e3bFewOHgLP88AGWM52oHBxcXNttnL';
  constructor() { }

  updateName(name) {
    this.petName = name;
  }

  updateImage(image) {
    this.petImage = image;
  }

  ngOnInit(): void {
  }

}
