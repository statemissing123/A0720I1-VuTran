import { Component, OnInit } from '@angular/core';
import {products} from '../../model/listProduct';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.scss']
})
export class ProductComponent implements OnInit {
  productList = products;

  constructor(private router: Router,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }


  InfoProduct(id: number) {
    this.router.navigateByUrl("/detail/"+id);
  }
}
