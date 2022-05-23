import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PanerComponent } from './paner.component';

describe('PanerComponent', () => {
  let component: PanerComponent;
  let fixture: ComponentFixture<PanerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PanerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PanerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
