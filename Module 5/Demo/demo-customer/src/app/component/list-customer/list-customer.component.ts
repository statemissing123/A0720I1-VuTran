import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/Customer';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.scss']
})
export class ListCustomerComponent implements OnInit {
  listCustomer : Customer[] = [];
  constructor(private customerService : CustomerService) { }

  ngOnInit(): void {
    this.initDataListProduct();
  }

  initDataListProduct() {
      this.listCustomer = this.customerService.getAllCustomer()
      console.log(this.listCustomer)
  }
}
