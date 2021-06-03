import {Injectable} from '@angular/core';
import {Customer} from '../model/Customer';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  // private listCustomer: Customer [] = [
  //   {
  //     id: 1,
  //     name: 'Viet Vu',
  //     birthday: '26/11/1999',
  //     card: 2222446666,
  //     phone: '02353555657',
  //     email: 'zittt2611@gmail.com',
  //     address: 'Quang Nam'
  //   },
  //   {
  //     id: 2,
  //     name: 'Hai Truong',
  //     birthday: '01/12/2010',
  //     card: 2222448888,
  //     phone: '02353010101',
  //     email: 'zittt2611@gmail.com',
  //     address: 'Dien Boan`'
  //   }
  // ];

  private url = 'http://localhost:3000/customer';
  constructor(private httpClient : HttpClient) {
  }

  getAllCustomer(): Observable<any> {
    return this.httpClient.get(this.url);
  }

  createCustomer(customer: Customer) : Observable<any> {
    return this.httpClient.post(this.url,customer);
  }

  deleteCustomer(id: number): Observable<any> {
    return this.httpClient.delete(this.url + "/" + id)
  }

  editCustomer(customer: Customer,id: number) :Observable<any> {
    return this.httpClient.put(this.url + "/" + id,customer)
  }

  getById(id: number): Observable<any> {
    return this.httpClient.get(this.url + "/" + id)
  }

  searchCustomer(search : string): Observable<any>{
    return this.httpClient.get(this.url + "?name_like=" + search)
  }




}

