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
  p: number = 1;
  search : "";
  selectedCustomer : Customer = {
    id: 0,
    name: '',
    birthday: '',
    card: 0,
    phone: '',
    email: '',
    address: ''
};
  constructor(private customerService : CustomerService, private router: Router) { }

  ngOnInit(): void {
    this.initDataListCustomer();
  }

  initDataListCustomer() {
    this.customerService.getAllCustomer().subscribe(
      data => {
        this.listCustomer = data;
      })
  }

  deleteCustomer(id: number) {
    this.customerService.deleteCustomer(id).subscribe(data => {
      this.ngOnInit()

    })
  }

  searchCustomer(){
    this.customerService.searchCustomer(this.search).subscribe(data =>{
      this.listCustomer = data;
    })
  }

  selectCustomer(customer : Customer){
    this.selectedCustomer = customer;
  }
}
