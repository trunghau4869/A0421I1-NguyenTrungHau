import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {BenhAn} from '../../../model/benhAn';
import {ProductServiceService} from '../../service/product-service.service';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {

  editForm: FormGroup;
  benhAn: BenhAn;

  constructor(private fb: FormBuilder, private service: ProductServiceService,
              private router: Router, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      // const id = Number(paramMap.get('id'));
      const id = paramMap.get('id');
      this.service.findById(id).subscribe(next => {
        this.benhAn = next;
        this.editForm.patchValue({
          id: this.benhAn.id,
          ma_benh_nhan: this.benhAn.ma_benh_nhan,
          ten_benh_nhan: this.benhAn.ten_benh_nhan,
          ngay_nhap_vien: this.benhAn.ngay_nhap_vien,
          ngay_xuat_vien: this.benhAn.ngay_xuat_vien,
          ly_do_nhap_vien: this.benhAn.ly_do_nhap_vien,
          phuong_phap_dieu_tri: this.benhAn.phuong_phap_dieu_tri,
          bac_si_dieu_tri: this.benhAn.bac_si_dieu_tri,

        });
      });
    });
    this.editForm = this.fb.group({
      id: '',
      ma_benh_nhan: ['', [Validators.required]],
      ten_benh_nhan: ['', [Validators.required]],
      ngay_nhap_vien: ['', [Validators.required]],
      ngay_xuat_vien: ['', [Validators.required]],
      ly_do_nhap_vien: ['', [Validators.required]],
      phuong_phap_dieu_tri: ['', [Validators.required]],
      bac_si_dieu_tri: ['', [Validators.required]],
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
      this.benhAn = this.editForm.value;
      this.service.updateStudent(this.benhAn).subscribe(next => this.router.navigateByUrl('/list'));
      // alert('Update success');
    }
  }
}
