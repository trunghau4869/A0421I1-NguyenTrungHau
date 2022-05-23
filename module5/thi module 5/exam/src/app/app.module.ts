import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListComponent } from './product/product-list/product-list.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { ProductDeleteComponent } from './product/product-delete/product-delete.component';
import { ProductEditComponent } from './product/product-edit/product-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductDeleteComponent,
    ProductEditComponent
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
export class AppModule { }
