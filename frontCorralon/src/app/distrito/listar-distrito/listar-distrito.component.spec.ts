import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarDistritoComponent } from './listar-distrito.component';

describe('ListarDistritoComponent', () => {
  let component: ListarDistritoComponent;
  let fixture: ComponentFixture<ListarDistritoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListarDistritoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarDistritoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
