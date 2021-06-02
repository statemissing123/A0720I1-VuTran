import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListCustomerComponent} from './component/list-customer/list-customer.component';
import {CreateCustomerComponent} from './component/create-customer/create-customer.component';
import {InfoCustomerComponent} from './component/info-customer/info-customer.component';
import {EditCustomerComponent} from './component/edit-customer/edit-customer.component';


const routes: Routes = [
  {path:"",component:ListCustomerComponent},
  {path:"create-customer",component:CreateCustomerComponent},
  {path:"info-customer/:id",component:InfoCustomerComponent},
  {path:"edit-customer/:id",component:EditCustomerComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
