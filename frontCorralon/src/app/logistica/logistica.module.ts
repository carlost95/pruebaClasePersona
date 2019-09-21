import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LogisticaRoutingModule } from './logistica-routing.module';
import { NavbarLogisticaComponent } from './navbar-logistica/navbar-logistica.component';


@NgModule({
  declarations: [NavbarLogisticaComponent],
  imports: [
    CommonModule,
    LogisticaRoutingModule
  ]
})
export class LogisticaModule { }
