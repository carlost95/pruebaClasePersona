package com.undec.corralon.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Clientes {
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private Byte habilitacion;
    private LocalDate fechaalta;
    private LocalDate fechaactualizacion;
    private LocalDate fechabaja;
    @JsonIgnore
    private List<Direcciones> direccionesById;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "dni")
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Basic
    @Column(name = "habilitacion")
    public Byte getHabilitacion() {
        return habilitacion;
    }

    public void setHabilitacion(Byte habilitacion) {
        this.habilitacion = habilitacion;
    }

    @Basic
    @Column(name = "fechaalta")
    public LocalDate getFechaalta() {
        return fechaalta;
    }


    public void setFechaalta(LocalDate fechaalta) {
        this.fechaalta = fechaalta;
    }

    @Basic
    @Column(name = "fechaactualizacion")
    public LocalDate getFechaactualizacion() {
        return fechaactualizacion;
    }


    public void setFechaactualizacion(LocalDate fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
    }

    @Basic
    @Column(name = "fechabaja")
    public LocalDate getFechabaja() {
        return fechabaja;
    }


    public void setFechabaja(LocalDate fechabaja) {
        this.fechabaja = fechabaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return Objects.equals(id, clientes.id) &&
                Objects.equals(nombre, clientes.nombre) &&
                Objects.equals(apellido, clientes.apellido) &&
                Objects.equals(dni, clientes.dni) &&
                Objects.equals(habilitacion, clientes.habilitacion) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, dni, habilitacion, fechaalta, fechaactualizacion, fechabaja);
    }

    @OneToMany(mappedBy = "clientesByFkclientesid")
    public Collection<Direcciones> getDireccionesById() {
        return direccionesById;
    }

    public void setDireccionesById(Collection<Direcciones> direccionesById) {
        this.direccionesById = (List<Direcciones>) direccionesById;
    }
}
