import { Component, OnInit } from '@angular/core';
import {FormGroup} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.scss']
})
export class EditProductComponent implements OnInit {
  formEdit!: FormGroup;
  id: number = 0;
  constructor(private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

  editProduct(value: any, id: number) {
    if (this.formEdit.valid){
      this.editProduct(this.formEdit.value,this.id);
      this.router.navigateByUrl("/")
    }
  }
}
