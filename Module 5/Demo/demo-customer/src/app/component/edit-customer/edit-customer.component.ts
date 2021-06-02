import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/Customer';
import {ActivatedRoute, Router} from '@angular/router';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.scss']
})
export class EditCustomerComponent implements OnInit {
  formEdit: FormGroup;
  private id: number = 0;
  constructor(private customerService: CustomerService,private activatedRoute: ActivatedRoute,private router:Router) { }

  initForm() {
    this.formEdit = new FormGroup({
      id: new FormControl(),
      name: new FormControl("",[Validators.required]),
      birthday : new FormControl("",[Validators.required]),
      card: new FormControl("",[Validators.required]),
      phone: new FormControl("",[Validators.required]),
      email: new FormControl("",[Validators.required,Validators.email]),
      address: new FormControl("",[Validators.required])
    });
  }

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.params['id'];
    this.initForm();
    this.formEdit.patchValue(this.customerService.getById(this.id));
  }

  editCustomer() {
    console.log(this.formEdit);
    if (this.formEdit.valid){
      this.customerService.editCustomer(this.formEdit.value,this.id);
      this.router.navigateByUrl("/")
    }
  }
}
