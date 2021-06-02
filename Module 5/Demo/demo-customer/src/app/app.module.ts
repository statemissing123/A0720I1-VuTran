import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ListCustomerComponent} from './component/list-customer/list-customer.component';
import {CreateCustomerComponent} from './component/create-customer/create-customer.component';
import {ReactiveFormsModule} from '@angular/forms';
import { EditCustomerComponent } from './component/edit-customer/edit-customer.component';
import { InfoCustomerComponent } from './component/info-customer/info-customer.component';


@NgModule({
  declarations: [
    AppComponent,
    CreateCustomerComponent,
    ListCustomerComponent,
    EditCustomerComponent,
    InfoCustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
