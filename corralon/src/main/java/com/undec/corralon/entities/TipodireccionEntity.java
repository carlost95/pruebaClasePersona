package com.undec.corralon.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tipodireccion", schema = "santo_domigo_corralon", catalog = "")
public class TipodireccionEntity {
    private Integer tipoDireccionId;
    private String tipoDireccionNombre;
    private String tipoDireccionAbreviatura;
    private Timestamp tipoDireccionFechaAlta;
    private Timestamp tipoDireccionFechaActualizacion;
    private Timestamp tipoDireccionFechaBaja;

    @Id
    @Column(name = "tipoDireccionId")
    public Integer getTipoDireccionId() {
        return tipoDireccionId;
    }

    public void setTipoDireccionId(Integer tipoDireccionId) {
        this.tipoDireccionId = tipoDireccionId;
    }

    @Basic
    @Column(name = "tipoDireccionNombre")
    public String getTipoDireccionNombre() {
        return tipoDireccionNombre;
    }

    public void setTipoDireccionNombre(String tipoDireccionNombre) {
        this.tipoDireccionNombre = tipoDireccionNombre;
    }

    @Basic
    @Column(name = "tipoDireccionAbreviatura")
    public String getTipoDireccionAbreviatura() {
        return tipoDireccionAbreviatura;
    }

    public void setTipoDireccionAbreviatura(String tipoDireccionAbreviatura) {
        this.tipoDireccionAbreviatura = tipoDireccionAbreviatura;
    }

    @Basic
    @Column(name = "tipoDireccionFechaAlta")
    public Timestamp getTipoDireccionFechaAlta() {
        return tipoDireccionFechaAlta;
    }

    public void setTipoDireccionFechaAlta(Timestamp tipoDireccionFechaAlta) {
        this.tipoDireccionFechaAlta = tipoDireccionFechaAlta;
    }

    @Basic
    @Column(name = "tipoDireccionFechaActualizacion")
    public Timestamp getTipoDireccionFechaActualizacion() {
        return tipoDireccionFechaActualizacion;
    }

    public void setTipoDireccionFechaActualizacion(Timestamp tipoDireccionFechaActualizacion) {
        this.tipoDireccionFechaActualizacion = tipoDireccionFechaActualizacion;
    }

    @Basic
    @Column(name = "tipoDireccionFechaBaja")
    public Timestamp getTipoDireccionFechaBaja() {
        return tipoDireccionFechaBaja;
    }

    public void setTipoDireccionFechaBaja(Timestamp tipoDireccionFechaBaja) {
        this.tipoDireccionFechaBaja = tipoDireccionFechaBaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipodireccionEntity that = (TipodireccionEntity) o;
        return Objects.equals(tipoDireccionId, that.tipoDireccionId) &&
                Objects.equals(tipoDireccionNombre, that.tipoDireccionNombre) &&
                Objects.equals(tipoDireccionAbreviatura, that.tipoDireccionAbreviatura) &&
                Objects.equals(tipoDireccionFechaAlta, that.tipoDireccionFechaAlta) &&
                Objects.equals(tipoDireccionFechaActualizacion, that.tipoDireccionFechaActualizacion) &&
                Objects.equals(tipoDireccionFechaBaja, that.tipoDireccionFechaBaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDireccionId, tipoDireccionNombre, tipoDireccionAbreviatura, tipoDireccionFechaAlta, tipoDireccionFechaActualizacion, tipoDireccionFechaBaja);
    }
}
