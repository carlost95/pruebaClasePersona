import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SeguridadRoutingModule } from './seguridad-routing.module';
import { NavbarSeguridadComponent } from './navbar-seguridad/navbar-seguridad.component';


@NgModule({
  declarations: [NavbarSeguridadComponent],
  imports: [
    CommonModule,
    SeguridadRoutingModule
  ]
})
export class SeguridadModule { }
