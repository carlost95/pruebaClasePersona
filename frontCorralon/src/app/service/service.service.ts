import { Cliente } from './../modelo/Cliente';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  clientes: Cliente[];
  constructor(private http: HttpClient) { }
  Url = 'http://localhost:8081/cliente';

 getClientes() {
    return this.http.get<Cliente[]>(this.Url);
  }
 /*  createPersona(persona: Persona){
      return this.http.post<Persona>(this.Url, persona);
  }
  getPersonaId(id: number){
    return this.http.get<Persona>(this.Url + '/' + id);
  }

  updatePersona(persona: Persona){
    return this.http.put<Persona>(this.Url + '/' + persona.id, persona);
  }
  deletePersona(persona:Persona){
    return this.http.delete(this.Url+'/'+persona.id);*/
 // }
}
