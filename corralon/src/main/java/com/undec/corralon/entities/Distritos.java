package com.undec.corralon.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Distritos {
    private Integer id;
    private String nombre;
    private String abreviatura;
    private Timestamp fechaalta;
    private Timestamp fechaactualizacion;
    private Timestamp fechabaja;
    private Departamentos departamentosByFkdepartamentosid;
    private Collection<Direcciones> direccionesById;

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
    @Column(name="nombre")
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "abreviatura")
    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
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
        Distritos distritos = (Distritos) o;
        return Objects.equals(id, distritos.id) &&
                Objects.equals(nombre, distritos.nombre) &&
                Objects.equals(abreviatura, distritos.abreviatura) &&
                Objects.equals(fechaalta, distritos.fechaalta) &&
                Objects.equals(fechaactualizacion, distritos.fechaactualizacion) &&
                Objects.equals(fechabaja, distritos.fechabaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, abreviatura, fechaalta, fechaactualizacion, fechabaja);
    }

    @ManyToOne
    @JoinColumn(name = "fkdepartamentosid", referencedColumnName = "id")
    public Departamentos getDepartamentosByFkdepartamentosid() {
        return departamentosByFkdepartamentosid;
    }

    public void setDepartamentosByFkdepartamentosid(Departamentos departamentosByFkdepartamentosid) {
        this.departamentosByFkdepartamentosid = departamentosByFkdepartamentosid;
    }

    @OneToMany(mappedBy = "distritosByFkdistritosid")
    public Collection<Direcciones> getDireccionesById() {
        return direccionesById;
    }

    public void setDireccionesById(Collection<Direcciones> direccionesById) {
        this.direccionesById = direccionesById;
    }
}
