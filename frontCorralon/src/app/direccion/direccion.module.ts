import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DireccionRoutingModule } from './direccion-routing.module';
import { ListarDireccionComponent } from './listar-direccion/listar-direccion.component';
import { AgregarDireccionComponent } from './agregar-direccion/agregar-direccion.component';
import { ModificarDireccionComponent } from './modificar-direccion/modificar-direccion.component';
import { EliminarDireccionComponent } from './eliminar-direccion/eliminar-direccion.component';


@NgModule({
  declarations: [ListarDireccionComponent, AgregarDireccionComponent, ModificarDireccionComponent, EliminarDireccionComponent],
  imports: [
    CommonModule,
    DireccionRoutingModule
  ]
})
export class DireccionModule { }
