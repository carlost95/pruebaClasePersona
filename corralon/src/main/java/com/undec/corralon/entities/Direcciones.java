package com.undec.corralon.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Direcciones {
    private Integer id;
    private String calle;
    private String numerocalle;
    private String barrio;
    private String entrecalles;
    private String descripcion;
    private LocalDate fechaalta;
    private LocalDate fechaactualizacion;
    private LocalDate fechabaja;
    private String ubicacion;
    private Clientes clientesByFkclientesid;
    private Distritos distritosByFkdistritosid;
    private Tipodirecciones tipodireccionesByFktipodireccionesid;

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
    @Column(name = "calle")
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Basic
    @Column(name = "numerocalle")
    public String getNumerocalle() {
        return numerocalle;
    }

    public void setNumerocalle(String numerocalle) {
        this.numerocalle = numerocalle;
    }

    @Basic
    @Column(name = "barrio")
    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Basic
    @Column(name = "entrecalles")
    public String getEntrecalles() {
        return entrecalles;
    }

    public void setEntrecalles(String entrecalles) {
        this.entrecalles = entrecalles;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    @Basic
    @Column(name = "ubicacion")
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direcciones that = (Direcciones) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(calle, that.calle) &&
                Objects.equals(numerocalle, that.numerocalle) &&
                Objects.equals(barrio, that.barrio) &&
                Objects.equals(entrecalles, that.entrecalles) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(fechaalta, that.fechaalta) &&
                Objects.equals(fechaactualizacion, that.fechaactualizacion) &&
                Objects.equals(fechabaja, that.fechabaja) &&
                Objects.equals(ubicacion, that.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, calle, numerocalle, barrio, entrecalles, descripcion, fechaalta, fechaactualizacion, fechabaja, ubicacion);
    }

    @ManyToOne
    @JoinColumn(name = "fkclientesid", referencedColumnName = "id")
    public Clientes getClientesByFkclientesid() {
        return clientesByFkclientesid;
    }

    public void setClientesByFkclientesid(Clientes clientesByFkclientesid) {
        this.clientesByFkclientesid = clientesByFkclientesid;
    }

    @ManyToOne
    @JoinColumn(name = "fkdistritosid", referencedColumnName = "id")
    public Distritos getDistritosByFkdistritosid() {
        return distritosByFkdistritosid;
    }

    public void setDistritosByFkdistritosid(Distritos distritosByFkdistritosid) {
        this.distritosByFkdistritosid = distritosByFkdistritosid;
    }

    @ManyToOne
    @JoinColumn(name = "fktipodireccionesid", referencedColumnName = "id")
    public Tipodirecciones getTipodireccionesByFktipodireccionesid() {
        return tipodireccionesByFktipodireccionesid;
    }

    public void setTipodireccionesByFktipodireccionesid(Tipodirecciones tipodireccionesByFktipodireccionesid) {
        this.tipodireccionesByFktipodireccionesid = tipodireccionesByFktipodireccionesid;
    }
}
