import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ComprasRoutingModule } from './compras-routing.module';
import { NavbarComprasComponent } from './navbar-compras/navbar-compras.component';


@NgModule({
  declarations: [NavbarComprasComponent],
  imports: [
    CommonModule,
    ComprasRoutingModule
  ]
})
export class ComprasModule { }
