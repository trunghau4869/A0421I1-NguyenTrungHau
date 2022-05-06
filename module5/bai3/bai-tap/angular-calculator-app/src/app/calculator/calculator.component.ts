import {Component, OnInit} from '@angular/core';


@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  start:number;
  end:number;
  result: any;


  constructor() {
  }

  ngOnInit(): void {
  }


  addition() {

    this.result = this.start + this.end;
  }

  subtraction() {
    this.result = this.start - this.end;
  }

  multiplication() {
    this.result = this.start * this.end;
  }

  division() {
    this.result = this.start / this.end;
  }
}
