import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../service/customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.scss']
})
export class CreateCustomerComponent implements OnInit {
  createForm: FormGroup;

  constructor(private customerService: CustomerService,private cs: FormBuilder,private  router: Router) {

  }

  ngOnInit(): void {
    this.initForm()
  }

  initForm() {
    this.createForm = new FormGroup({
      name: new FormControl("",[Validators.required,Validators.minLength(6)]),
      birthday : new FormControl("",[Validators.required]),
      card: new FormControl("",[Validators.required,Validators.minLength(9),Validators.maxLength(12)]),
      phone: new FormControl("",[Validators.required,Validators.pattern(/^\+84\d{9,10}$/)]),
      email: new FormControl("",[Validators.required,Validators.email]),
      address: new FormControl("",[Validators.required])
    })
  }
  onSubmit() {
    if (this.createForm.valid){
      this.customerService.createCustomer(this.createForm.value).subscribe(data => {
        this.router.navigateByUrl("/")
      });
    }
  }
}
