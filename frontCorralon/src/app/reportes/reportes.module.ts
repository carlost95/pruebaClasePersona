import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ReportesRoutingModule } from './reportes-routing.module';
import { NavbarReportesComponent } from './navbar-reportes/navbar-reportes.component';


@NgModule({
  declarations: [NavbarReportesComponent],
  imports: [
    CommonModule,
    ReportesRoutingModule
  ]
})
export class ReportesModule { }
