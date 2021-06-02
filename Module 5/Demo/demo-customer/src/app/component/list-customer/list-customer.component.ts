import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/Customer';
import {CustomerService} from '../../service/customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.scss']
})
export class ListCustomerComponent implements OnInit {
  listCustomer : Customer[] = [];
  constructor(private customerService : CustomerService, private router: Router) { }

  ngOnInit(): void {
    this.initDataListProduct();
  }

  initDataListProduct() {
      this.listCustomer = this.customerService.getAllCustomer()
      console.log(this.listCustomer)
  }

  deleteCustomer(id: number) {
    this.customerService.deleteStudent(id);
    this.listCustomer = this.customerService.getAllCustomer();
  }
}
