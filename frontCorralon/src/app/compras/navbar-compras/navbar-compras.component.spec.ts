import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbarComprasComponent } from './navbar-compras.component';

describe('NavbarComprasComponent', () => {
  let component: NavbarComprasComponent;
  let fixture: ComponentFixture<NavbarComprasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NavbarComprasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NavbarComprasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
