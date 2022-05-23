import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ProductListComponent} from './product/product-list/product-list.component';
import {ProductDeleteComponent} from './product/product-delete/product-delete.component';
import {ProductEditComponent} from './product/product-edit/product-edit.component';


const routes: Routes = [
  {
    path: 'list',
    component: ProductListComponent
  }, {
    path: 'delete/:id',
    component: ProductDeleteComponent
  }, {
    path: 'edit/:id',
    component: ProductEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
