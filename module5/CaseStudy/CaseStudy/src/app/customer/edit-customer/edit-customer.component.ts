import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Customer} from '../../../model/Customer';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ServiceFuramaService} from '../../service/service-furama.service';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  editForm: FormGroup;
  customers: Customer;

  constructor(private fb: FormBuilder, private service: ServiceFuramaService,
              private router: Router, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));
      this.service.findById(id).subscribe(next => {
        this.customers = next;
        this.editForm.patchValue({
          id: this.customers.id,
          name: this.customers.name,
          birthday: this.customers.birthday,
          gender: this.customers.gender,
          idCard: this.customers.idCard,
          phone: this.customers.phone,
          mail: this.customers.mail,
          type: this.customers.type,
          address: this.customers.address,

        });
      });
    });
    this.editForm = this.fb.group({
      id: '',
      name: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      gender: ['', [Validators.required]],
      idCard: ['', [Validators.required]],
      phone: ['', [Validators.required, Validators.pattern('^\\+84\\d{9,10}$')]],
      mail: ['', [Validators.required]],
      type: ['', [Validators.required]],
      address: ['', [Validators.required]]
      // id: ['', Validators.required],
      // ten_sinh_vien: ['', [Validators.required, Validators.pattern(/[^0-9/~?><.,@]$/)]],
      // email: ['', [Validators.required, Validators.pattern(/^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+$/)]],
      // ten_de_tai: ['', Validators.required],
      // so_dien_thoai: ['', [Validators.required, Validators.pattern(/^([0-9]{10}|[0-9]{12})$/)]],
      // giao_vien_huong_dan: ['', Validators.required],
      // ten_nhom: ['', [Validators.required, Validators.pattern(/^(nhom)\s[123]$/)]]
    });
  }

  onSubmit(): void {
    console.log(this.editForm);
    if (this.editForm.valid) {
      this.customers = this.editForm.value;
      this.service.updateStudent(this.customers).subscribe(next => this.router.navigateByUrl('/furama/customer'));
      alert('Update success');
    }
  }
}
