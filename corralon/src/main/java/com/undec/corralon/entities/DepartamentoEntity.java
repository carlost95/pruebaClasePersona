package com.undec.corralon.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "departamento", schema = "santo_domigo_corralon", catalog = "")
public class DepartamentoEntity {
    private Integer departamentoId;
    private String departamentoNombre;
    private String departamentoAbreviatura;
    private Timestamp departamentoFechaAlta;
    private Timestamp departamentoFechaActualizacion;
    private Timestamp departamentoFechaBaja;

    @Id
    @Column(name = "departamentoId")
    public Integer getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Integer departamentoId) {
        this.departamentoId = departamentoId;
    }

    @Basic
    @Column(name = "departamentoNombre")
    public String getDepartamentoNombre() {
        return departamentoNombre;
    }

    public void setDepartamentoNombre(String departamentoNombre) {
        this.departamentoNombre = departamentoNombre;
    }

    @Basic
    @Column(name = "departamentoAbreviatura")
    public String getDepartamentoAbreviatura() {
        return departamentoAbreviatura;
    }

    public void setDepartamentoAbreviatura(String departamentoAbreviatura) {
        this.departamentoAbreviatura = departamentoAbreviatura;
    }

    @Basic
    @Column(name = "departamentoFechaAlta")
    public Timestamp getDepartamentoFechaAlta() {
        return departamentoFechaAlta;
    }

    public void setDepartamentoFechaAlta(Timestamp departamentoFechaAlta) {
        this.departamentoFechaAlta = departamentoFechaAlta;
    }

    @Basic
    @Column(name = "departamentoFechaActualizacion")
    public Timestamp getDepartamentoFechaActualizacion() {
        return departamentoFechaActualizacion;
    }

    public void setDepartamentoFechaActualizacion(Timestamp departamentoFechaActualizacion) {
        this.departamentoFechaActualizacion = departamentoFechaActualizacion;
    }

    @Basic
    @Column(name = "departamentoFechaBaja")
    public Timestamp getDepartamentoFechaBaja() {
        return departamentoFechaBaja;
    }

    public void setDepartamentoFechaBaja(Timestamp departamentoFechaBaja) {
        this.departamentoFechaBaja = departamentoFechaBaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartamentoEntity that = (DepartamentoEntity) o;
        return Objects.equals(departamentoId, that.departamentoId) &&
                Objects.equals(departamentoNombre, that.departamentoNombre) &&
                Objects.equals(departamentoAbreviatura, that.departamentoAbreviatura) &&
                Objects.equals(departamentoFechaAlta, that.departamentoFechaAlta) &&
                Objects.equals(departamentoFechaActualizacion, that.departamentoFechaActualizacion) &&
                Objects.equals(departamentoFechaBaja, that.departamentoFechaBaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamentoId, departamentoNombre, departamentoAbreviatura, departamentoFechaAlta, departamentoFechaActualizacion, departamentoFechaBaja);
    }
}
