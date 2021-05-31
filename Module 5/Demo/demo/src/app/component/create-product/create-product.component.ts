import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {FormGroup} from '@angular/forms';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.scss']
})
export class CreateProductComponent implements OnInit {
  formCreate !: FormGroup

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  createProduct(value: any) {
    if (this.formCreate.valid) {
      this.createProduct(this.formCreate.value);
      this.router.navigateByUrl("/");
    }
  }
}
