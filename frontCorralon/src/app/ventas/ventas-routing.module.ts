import { ListarDireccionComponent } from './../direccion/listar-direccion/listar-direccion.component';
import { ListarDistritoComponent } from './../distrito/listar-distrito/listar-distrito.component';
import { ListarDepartamentoComponent } from './../departamento/listar-departamento/listar-departamento.component';
import { ListarClientesComponent } from './../cliente/listar-clientes/listar-clientes.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  {path: 'listar-cliente', component: ListarClientesComponent},
  {path: 'listar-departamento', component: ListarDepartamentoComponent},
  {path: 'listar-distrito', component: ListarDistritoComponent},
  {path: 'listar-direccion', component: ListarDireccionComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VentasRoutingModule { }
