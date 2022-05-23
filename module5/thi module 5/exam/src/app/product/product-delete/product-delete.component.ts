import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ProductServiceService} from '../../service/product-service.service';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute, private service: ProductServiceService,
              private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      console.log(id);
      this.service.deleteStudent(id).subscribe(next => this.router.navigateByUrl('list'));
    });
  }
}
