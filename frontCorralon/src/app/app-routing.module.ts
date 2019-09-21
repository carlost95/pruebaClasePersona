import { NavbarLogisticaComponent } from './logistica/navbar-logistica/navbar-logistica.component';
import { NavbarReportesComponent } from './reportes/navbar-reportes/navbar-reportes.component';
import { NavbarSeguridadComponent } from './seguridad/navbar-seguridad/navbar-seguridad.component';
import { NavbarVentasComponent } from './ventas/navbar-ventas/navbar-ventas.component';
import { ListarDepartamentoComponent } from './departamento/listar-departamento/listar-departamento.component';
import { ListarDireccionComponent } from './direccion/listar-direccion/listar-direccion.component';
import { ListarDistritoComponent } from './distrito/listar-distrito/listar-distrito.component';
import { ListarClientesComponent } from './cliente/listar-clientes/listar-clientes.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NavbarComprasComponent } from './compras/navbar-compras/navbar-compras.component';


const routes: Routes = [
  {path: 'navbar-ventas', component: NavbarVentasComponent},
  {path: 'navbar-compras', component: NavbarComprasComponent},
  {path: 'navbar-seguridad', component: NavbarSeguridadComponent},
  {path: 'navbar-reportes', component: NavbarReportesComponent},
  {path: 'navbar-logistica', component: NavbarLogisticaComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
