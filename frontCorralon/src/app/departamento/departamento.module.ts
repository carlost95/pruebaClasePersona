import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DepartamentoRoutingModule } from './departamento-routing.module';
import { ListarDepartamentoComponent } from '../ventas/listar-departamento/listar-departamento.component';
import { AgregarDepartamentoComponent } from '../ventas/agregar-departamento/agregar-departamento.component';


@NgModule({
  declarations: [ListarDepartamentoComponent, AgregarDepartamentoComponent],
  imports: [
    CommonModule,
    DepartamentoRoutingModule
  ]
})
export class DepartamentoModule { }
