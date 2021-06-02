import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/Customer';
import {CustomerService} from '../../service/customer.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-info-customer',
  templateUrl: './info-customer.component.html',
  styleUrls: ['./info-customer.component.scss']
})
export class InfoCustomerComponent implements OnInit {
  customer : Customer = null;

  constructor(private customerService : CustomerService,private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    let id = this.activatedRoute.snapshot.params['id'];
    this.customer = this.customerService.getById(id);
  }

}
