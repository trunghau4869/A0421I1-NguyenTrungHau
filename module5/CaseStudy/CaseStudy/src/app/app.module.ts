import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {CreateServiceComponent} from './furama/create-service/create-service.component';
import {EditServiceComponent} from './furama/edit-service/edit-service.component';
import {ListServiceComponent} from './furama/list-service/list-service.component';
import {EditCustomerComponent} from './customer/edit-customer/edit-customer.component';
import {HeaderComponent} from './display/header/header.component';
import {NavbarComponent} from './display/navbar/navbar.component';
import {FooterComponent} from './display/footer/footer.component';
import {ListContractComponent} from './contract/list-contract/list-contract.component';
import {CreateContractComponent} from './contract/create-contract/create-contract.component';
import {PanerComponent} from './display/paner/paner.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {ListCustomerComponent} from './customer/list-customer/list-customer.component';
import {HttpClientModule} from '@angular/common/http';
import { CreateCustomerComponent } from './customer/create-customer/create-customer.component';
import { DeleteCustomerComponent } from './customer/delete-customer/delete-customer.component';
@NgModule({
  declarations: [
    AppComponent,
    CreateServiceComponent,
    EditServiceComponent,
    ListServiceComponent,
    EditCustomerComponent,
    HeaderComponent,
    NavbarComponent,
    FooterComponent,
    ListContractComponent,
    CreateContractComponent,
    PanerComponent,
    ListCustomerComponent,
    CreateCustomerComponent,
    DeleteCustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
