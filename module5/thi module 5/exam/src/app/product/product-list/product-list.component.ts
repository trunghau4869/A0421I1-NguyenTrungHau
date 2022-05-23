import {Component, OnInit} from '@angular/core';
import {BenhAn} from '../../../model/benhAn';
import {ProductServiceService} from '../../service/product-service.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  product: BenhAn[];

  constructor(private service: ProductServiceService) {
  }

  ngOnInit(): void {
    this.service.getList().subscribe(next => this.product = next);
  }

}
