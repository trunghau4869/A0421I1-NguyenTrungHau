import {Component, OnInit} from '@angular/core';
import {DictionaryServiceService} from '../service/dictionary-service.service';
import {Iword} from '../model/Iword';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {

  words: Iword[] = [];

  constructor(private dictionaryServiceService: DictionaryServiceService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.words = this.dictionaryServiceService.words;
  }

}
