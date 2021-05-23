import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.scss']
})
export class ProductComponent implements OnInit {
  product = {
    id: 1,
    name : "Viet Vu",
    grade: 12,
    image :
  }
  constructor() { }

  ngOnInit(): void {
  }

}
