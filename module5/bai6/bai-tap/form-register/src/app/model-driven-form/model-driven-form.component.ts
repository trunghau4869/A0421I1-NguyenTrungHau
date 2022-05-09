import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
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
      Email: new FormControl('', [Validators.required, Validators.minLength(3)]),
      Password: new FormControl('', Validators.required),
      ConfirmPassword: new FormControl('', Validators.required),
      Country: new FormControl('', Validators.required),
      Age: new FormControl('', Validators.required),
      Gender: new FormControl('', Validators.required),
      Phone: new FormControl('', Validators.required)
    });
    this.formCreateAccount.reset();
  }

  createAccount(account: Account) {
    // AccountDAO.accountDao.push(account);
    console.log(this.formCreateAccount);

  }
}
