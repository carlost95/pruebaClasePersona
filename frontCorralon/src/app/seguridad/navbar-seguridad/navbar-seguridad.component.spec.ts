import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbarSeguridadComponent } from './navbar-seguridad.component';

describe('NavbarSeguridadComponent', () => {
  let component: NavbarSeguridadComponent;
  let fixture: ComponentFixture<NavbarSeguridadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NavbarSeguridadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NavbarSeguridadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
