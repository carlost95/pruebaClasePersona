package com.undec.corralon.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "clientes", schema = "santo_domingo_corralon", catalog = "")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClientesEntity implements Serializable {
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private Byte habilitacion;
    private Timestamp fechaalta;
    private Timestamp fechaactualizacion;
    private Timestamp fechabaja;

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
    public Timestamp getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Timestamp fechaalta) {
        this.fechaalta = fechaalta;
    }

    @Basic
    @Column(name = "fechaactualizacion")
    public Timestamp getFechaactualizacion() {
        return fechaactualizacion;
    }

    public void setFechaactualizacion(Timestamp fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
    }

    @Basic
    @Column(name = "fechabaja")
    public Timestamp getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Timestamp fechabaja) {
        this.fechabaja = fechabaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientesEntity that = (ClientesEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apellido, that.apellido) &&
                Objects.equals(dni, that.dni) &&
                Objects.equals(habilitacion, that.habilitacion) &&
                Objects.equals(fechaalta, that.fechaalta) &&
                Objects.equals(fechaactualizacion, that.fechaactualizacion) &&
                Objects.equals(fechabaja, that.fechabaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, dni, habilitacion, fechaalta, fechaactualizacion, fechabaja);
    }
}
