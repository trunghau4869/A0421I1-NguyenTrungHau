import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ListServiceComponent} from './furama/list-service/list-service.component';
import {CreateServiceComponent} from './furama/create-service/create-service.component';

import {ListCustomerComponent} from './customer/list-customer/list-customer.component';
import {CreateCustomerComponent} from './customer/create-customer/create-customer.component';
import {EditCustomerComponent} from './customer/edit-customer/edit-customer.component';
import {DeleteCustomerComponent} from './customer/delete-customer/delete-customer.component';
import {PanerComponent} from './display/paner/paner.component';


const routes: Routes = [{
  path: 'furama/list',
  component: ListServiceComponent,
}, {
  path: 'furama/create-service',
  component: CreateServiceComponent
}, {
  path: 'furama/customer',
  component: ListCustomerComponent
}
  , {
    path: 'furama/customer-create',
    component: CreateCustomerComponent
  }, {
    path: 'furama/customer-edit/:id',
    component: EditCustomerComponent
  }, {
    path: 'furama/customer-delete/:id',
    component: DeleteCustomerComponent
  }, {
    path: '',
    component: PanerComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
