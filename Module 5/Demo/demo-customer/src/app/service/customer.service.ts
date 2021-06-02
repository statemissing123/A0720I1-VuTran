import {Injectable} from '@angular/core';
import {Customer} from '../model/Customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private listCustomer: Customer [] = [
    {
      id: 1,
      name: 'Viet Vu',
      birthday: '26/11/1999',
      card: 2222446666,
      phone: '02353555657',
      email: 'zittt2611@gmail.com',
      address: 'Quang Nam'
    },
    {
      id: 2,
      name: 'Hai Truong',
      birthday: '01/12/2010',
      card: 2222448888,
      phone: '02353010101',
      email: 'zittt2611@gmail.com',
      address: 'Dien Boan`'
    }
  ];

  constructor() {
  }

  getAllCustomer(): Customer[] {
    return this.listCustomer;
  }

  createCustomer(customer: Customer) {
    if (this.listCustomer.length == 0) {
      customer.id = 1;
    } else {
      customer.id = this.listCustomer[this.listCustomer.length - 1].id + 1;
    }
    return this.listCustomer.push(customer);
  }

  deleteStudent(id: number): void {
    this.listCustomer = this.listCustomer.filter(
      customer => customer.id !== id
    );
  }

  editCustomer(customer: Customer,id: number) {
    for (let i = 0; i < this.listCustomer.length; i++) {
      if (this.listCustomer[i].id == id) {
        this.listCustomer[i] = customer;
      }
    }
  }

  getById(id: number): Customer {
    for (const customer of this.listCustomer) {
      if (id == customer.id) {
        return customer;
      }
    }
    return null;
  }




}

