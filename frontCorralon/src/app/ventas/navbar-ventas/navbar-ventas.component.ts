import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
@Component({
  selector: 'app-navbar-ventas',
  templateUrl: './navbar-ventas.component.html',
  styleUrls: ['./navbar-ventas.component.css']
})
export class NavbarVentasComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }
  departamento() {
    this.router.navigate(['listar-departamento']);
  }
  direccion() {
    this.router.navigate(['listar-direccion']);
  }
  distrito() {
    this.router.navigate(['listar-distrito']);
  }
  cliente() {
    this.router.navigate(['listar-cliente']);
  }

}
