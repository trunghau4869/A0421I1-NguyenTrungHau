import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {Customer} from '../../../model/Customer';
import {ServiceFuramaService} from '../../service/service-furama.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  formCreateCustomer: FormGroup;
  customers: Customer;

  constructor(private router: Router, private service: ServiceFuramaService) {
  }

  ngOnInit(): void {
    this.formCreateCustomer = new FormGroup({
      id: new FormControl('', Validators.required),
      name: new FormControl('', Validators.required),
      birthday: new FormControl('', [Validators.required]),
      gender: new FormControl('', Validators.required),
      idCard: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required]),
      // CustomerPhone: new FormControl('', [Validators.required, Validators.pattern('^\\+84\\d{9,10}$')]),
      mail: new FormControl('', [Validators.required, Validators.email]),
      type: new FormControl('', Validators.required),
      address: new FormControl('', Validators.required)
    });
    this.formCreateCustomer.reset();
  }

  createCustomer() {
    console.log(this.formCreateCustomer.value);
    if (this.formCreateCustomer.valid) {
      this.customers = this.formCreateCustomer.value;
      this.service.saveCustomer(this.customers).subscribe(next => this.router.navigateByUrl('/furama/customer'));
      alert('Create success');
    }
  }
}
