import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbarLogisticaComponent } from './navbar-logistica.component';

describe('NavbarLogisticaComponent', () => {
  let component: NavbarLogisticaComponent;
  let fixture: ComponentFixture<NavbarLogisticaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NavbarLogisticaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NavbarLogisticaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
