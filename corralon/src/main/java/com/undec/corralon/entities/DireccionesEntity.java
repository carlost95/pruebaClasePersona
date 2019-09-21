package com.undec.corralon.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "direcciones", schema = "santo_domingo_corralon", catalog = "")
public class DireccionesEntity {
    private Integer id;
    private String calle;
    private String numerocalle;
    private String barrio;
    private String entrecalles;
    private String descripcion;
    private Timestamp fechaalta;
    private Timestamp fechaactualizacion;
    private Timestamp fechabaja;
    private ClientesEntity clientesByFkclientesid;

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
        DireccionesEntity that = (DireccionesEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(calle, that.calle) &&
                Objects.equals(numerocalle, that.numerocalle) &&
                Objects.equals(barrio, that.barrio) &&
                Objects.equals(entrecalles, that.entrecalles) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(fechaalta, that.fechaalta) &&
                Objects.equals(fechaactualizacion, that.fechaactualizacion) &&
                Objects.equals(fechabaja, that.fechabaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, calle, numerocalle, barrio, entrecalles, descripcion, fechaalta, fechaactualizacion, fechabaja);
    }

    @ManyToOne
    @JoinColumn(name = "fkclientesid", referencedColumnName = "id")
    public ClientesEntity getClientesByFkclientesid() {
        return clientesByFkclientesid;
    }

    public void setClientesByFkclientesid(ClientesEntity clientesByFkclientesid) {
        this.clientesByFkclientesid = clientesByFkclientesid;
    }
}
