import { ServiceService } from './service/service.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClienteModule } from './cliente/cliente.module';
import { DireccionModule } from './direccion/direccion.module';
import { DepartamentoModule } from './departamento/departamento.module';
import { DitritoModule } from './distrito/ditrito.module';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';


import { from } from 'rxjs';
import { VentasModule } from './ventas/ventas.module';
import { ComprasModule } from './compras/compras.module';
import { SeguridadModule } from './seguridad/seguridad.module';
import { LogisticaModule } from './logistica/logistica.module';
import { ReportesModule } from './reportes/reportes.module';



@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    ClienteModule,
    DireccionModule,
    DepartamentoModule,
    DitritoModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    VentasModule,
    ComprasModule,
    SeguridadModule,
    LogisticaModule,
    ReportesModule


  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
