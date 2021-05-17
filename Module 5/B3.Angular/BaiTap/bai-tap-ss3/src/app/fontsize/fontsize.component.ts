import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fontsize',
  templateUrl: './fontsize.component.html',
  styleUrls: ['./fontsize.component.scss']
})
export class FontsizeComponent implements OnInit {

  fontSize = 14;
  constructor() { }
  onChange(value) {
    this.fontSize = value;
  }
  ngOnInit(): void {
  }

}
