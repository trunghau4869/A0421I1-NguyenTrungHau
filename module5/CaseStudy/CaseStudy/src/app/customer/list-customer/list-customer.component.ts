import {Component, OnInit} from '@angular/core';
import {Customer} from '../../../model/Customer';
import {ServiceFuramaService} from '../../service/service-furama.service';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  customers: Customer[];

  constructor(private service: ServiceFuramaService) {
  }

  ngOnInit(): void {
    this.service.getList().subscribe(next => this.customers = next);
  }

}
