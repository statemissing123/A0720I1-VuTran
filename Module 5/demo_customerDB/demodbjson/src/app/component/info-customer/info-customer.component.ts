import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/Customer';
import {CustomerService} from '../../service/customer.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-info-customer',
  templateUrl: './info-customer.component.html',
  styleUrls: ['./info-customer.component.scss']
})
export class InfoCustomerComponent implements OnInit {
  customer : Customer = null;
  private id : number = 0;
  constructor(private customerService : CustomerService,private activatedRoute: ActivatedRoute,private router: Router) { }

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.params['id'];
    this.customerService.getById(this.id).subscribe(data => {
      this.customer = data;
    })
  }

}
