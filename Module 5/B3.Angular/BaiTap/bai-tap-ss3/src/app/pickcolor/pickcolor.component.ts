import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pickcolor',
  templateUrl: './pickcolor.component.html',
  styleUrls: ['./pickcolor.component.scss']
})
export class PickcolorComponent implements OnInit {
  constructor() { }
  background = '#00e067';

  ngOnInit(): void {
  }

}
