import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductComponent } from './component/product/product.component';
import { DetailProductComponent } from './component/detail-product/detail-product.component';
import { EditProductComponent } from './component/edit-product/edit-product.component';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { CreateProductComponent } from './component/create-product/create-product.component';


@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    DetailProductComponent,
    EditProductComponent,
    CreateProductComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
