import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-caculator',
  templateUrl: './caculator.component.html',
  styleUrls: ['./caculator.component.scss']
})
export class CaculatorComponent implements OnInit {
  number1 =0;
  number2 =0;
  caculator = "";
  result = 0;
  constructor() { }

  ngOnInit(): void {
  }

  caculatorResult() {
    switch (this.caculator) {
      case '+': {
        this.result = this.number1 + this.number2;
        break;
      }
      case  '-': {
        this.result= this.number1 -this.number2;
        break;
      }
      case  '*': {
        this.result= this.number1 *this.number2;
        break;
      }
      case  '/': {
        this.result= this.number1 /this.number2;
        break;
      }


    }
  }
}
