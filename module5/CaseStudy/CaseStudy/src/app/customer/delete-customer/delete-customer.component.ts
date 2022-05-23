import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ServiceFuramaService} from '../../service/service-furama.service';

@Component({
  selector: 'app-delete-customer',
  templateUrl: './delete-customer.component.html',
  styleUrls: ['./delete-customer.component.css']
})
export class DeleteCustomerComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute, private service: ServiceFuramaService,
              private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      console.log(id);
      this.service.deleteStudent(id).subscribe(next => this.router.navigateByUrl('furama/customer'));
    });
  }

}
