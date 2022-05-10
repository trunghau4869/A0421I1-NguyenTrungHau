import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {AccountDAO} from '../AccountDAO';

@Component({
  selector: 'app-model-driven-form',
  templateUrl: './model-driven-form.component.html',
  styleUrls: ['./model-driven-form.component.css']
})
export class ModelDrivenFormComponent implements OnInit {

  // students: Account[] = AccountDAO.accountDao;
  formCreateAccount: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    this.formCreateAccount = new FormGroup({
      Email: new FormControl('', [Validators.required, Validators.email]),
      pwGroup: new FormGroup({
        Password: new FormControl('', Validators.required),
        ConfirmPassword: new FormControl('', Validators.required),
      }, this.comparePassword),
      Country: new FormControl('', Validators.required),
      Age: new FormControl('', [Validators.required]),
      Gender: new FormControl('', Validators.required),
      Phone: new FormControl('', [Validators.required, Validators.pattern('^\\+84\\d{9,10}$')])
    });
    this.formCreateAccount.reset();
  }


  createAccount(account: Account) {
    console.log(this.formCreateAccount);
  }

  comparePassword(c: AbstractControl) {
    const v = c.value;
    return (v.password === v.confirmPassword) ?
      null : {
        passwordnotmatch: true
      }
      ;
  }
}

