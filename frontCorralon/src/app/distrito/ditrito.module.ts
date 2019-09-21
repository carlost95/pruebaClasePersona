import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DitritoRoutingModule } from './ditrito-routing.module';
import { ListarDistritoComponent } from './listar-distrito/listar-distrito.component';


@NgModule({
  declarations: [ListarDistritoComponent],
  imports: [
    CommonModule,
    DitritoRoutingModule
  ]
})
export class DitritoModule { }
