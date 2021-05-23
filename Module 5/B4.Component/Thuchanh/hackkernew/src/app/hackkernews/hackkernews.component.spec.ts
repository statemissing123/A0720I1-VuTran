import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HackkernewsComponent } from './hackkernews.component';

describe('HackkernewsComponent', () => {
  let component: HackkernewsComponent;
  let fixture: ComponentFixture<HackkernewsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HackkernewsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HackkernewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
