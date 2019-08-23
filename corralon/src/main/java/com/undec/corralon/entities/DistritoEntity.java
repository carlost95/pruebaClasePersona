package com.undec.corralon.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "distrito", schema = "santo_domigo_corralon", catalog = "")
public class DistritoEntity {
    private Integer distritoId;
    private String distritoNombre;
    private String distritoAbreviatura;
    private Timestamp distritoFechaAlta;
    private Timestamp distritoFechaActualizacion;
    private Timestamp distritoFechaBaja;
    private DepartamentoEntity departamentoByDepartamentoId;

    @Id
    @Column(name = "distritoId")
    public Integer getDistritoId() {
        return distritoId;
    }

    public void setDistritoId(Integer distritoId) {
        this.distritoId = distritoId;
    }

    @Basic
    @Column(name = "distritoNombre")
    public String getDistritoNombre() {
        return distritoNombre;
    }

    public void setDistritoNombre(String distritoNombre) {
        this.distritoNombre = distritoNombre;
    }

    @Basic
    @Column(name = "distritoAbreviatura")
    public String getDistritoAbreviatura() {
        return distritoAbreviatura;
    }

    public void setDistritoAbreviatura(String distritoAbreviatura) {
        this.distritoAbreviatura = distritoAbreviatura;
    }

    @Basic
    @Column(name = "distritoFechaAlta")
    public Timestamp getDistritoFechaAlta() {
        return distritoFechaAlta;
    }

    public void setDistritoFechaAlta(Timestamp distritoFechaAlta) {
        this.distritoFechaAlta = distritoFechaAlta;
    }

    @Basic
    @Column(name = "distritoFechaActualizacion")
    public Timestamp getDistritoFechaActualizacion() {
        return distritoFechaActualizacion;
    }

    public void setDistritoFechaActualizacion(Timestamp distritoFechaActualizacion) {
        this.distritoFechaActualizacion = distritoFechaActualizacion;
    }

    @Basic
    @Column(name = "distritoFechaBaja")
    public Timestamp getDistritoFechaBaja() {
        return distritoFechaBaja;
    }

    public void setDistritoFechaBaja(Timestamp distritoFechaBaja) {
        this.distritoFechaBaja = distritoFechaBaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DistritoEntity that = (DistritoEntity) o;
        return Objects.equals(distritoId, that.distritoId) &&
                Objects.equals(distritoNombre, that.distritoNombre) &&
                Objects.equals(distritoAbreviatura, that.distritoAbreviatura) &&
                Objects.equals(distritoFechaAlta, that.distritoFechaAlta) &&
                Objects.equals(distritoFechaActualizacion, that.distritoFechaActualizacion) &&
                Objects.equals(distritoFechaBaja, that.distritoFechaBaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distritoId, distritoNombre, distritoAbreviatura, distritoFechaAlta, distritoFechaActualizacion, distritoFechaBaja);
    }

    @ManyToOne
    @JoinColumn(name = "departamentoId", referencedColumnName = "departamentoId")
    public DepartamentoEntity getDepartamentoByDepartamentoId() {
        return departamentoByDepartamentoId;
    }

    public void setDepartamentoByDepartamentoId(DepartamentoEntity departamentoByDepartamentoId) {
        this.departamentoByDepartamentoId = departamentoByDepartamentoId;
    }
}
