import { AppComponent } from './../app.component';
import { ListarDireccionComponent } from './../direccion/listar-direccion/listar-direccion.component';
import { ListarDistritoComponent } from './../distrito/listar-distrito/listar-distrito.component';
import { ListarDepartamentoComponent } from './listar-departamento/listar-departamento.component';
import { ListarClientesComponent } from './listar-clientes/listar-clientes.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VentasRoutingModule { }
