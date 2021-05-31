import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {EditProductComponent} from './component/edit-product/edit-product.component';
import {ProductComponent} from './component/product/product.component';
import {CreateProductComponent} from './component/create-product/create-product.component';


const routes: Routes = [
  {path: "", component: ProductComponent},
  {path: 'edit-product/:id', component: EditProductComponent},
  {path: 'create-product', component: CreateProductComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
