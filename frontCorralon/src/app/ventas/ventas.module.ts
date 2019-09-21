import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VentasRoutingModule } from './ventas-routing.module';
import { NavbarVentasComponent } from './navbar-ventas/navbar-ventas.component';


@NgModule({
  declarations: [NavbarVentasComponent],
  imports: [
    CommonModule,
    VentasRoutingModule
  ]
})
export class VentasModule { }
