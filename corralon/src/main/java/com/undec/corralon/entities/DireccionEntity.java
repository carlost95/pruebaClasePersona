package com.undec.corralon.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "direccion", schema = "santo_domigo_corralon", catalog = "")
public class DireccionEntity {
    private Integer direccionId;
    private String direccionCalle;
    private String direccionNumero;
    private String direccionBarrio;
    private String direccionEntreCalles;
    private String direccionDescripcion;
    private Timestamp direccionFechaAlta;
    private Timestamp direccionFechaActualizacion;
    private Timestamp direccionFechaBaja;
    private ClienteEntity clienteByClienteId;

    @Id
    @Column(name = "direccionId")
    public Integer getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(Integer direccionId) {
        this.direccionId = direccionId;
    }

    @Basic
    @Column(name = "direccionCalle")
    public String getDireccionCalle() {
        return direccionCalle;
    }

    public void setDireccionCalle(String direccionCalle) {
        this.direccionCalle = direccionCalle;
    }

    @Basic
    @Column(name = "direccionNumero")
    public String getDireccionNumero() {
        return direccionNumero;
    }

    public void setDireccionNumero(String direccionNumero) {
        this.direccionNumero = direccionNumero;
    }

    @Basic
    @Column(name = "direccionBarrio")
    public String getDireccionBarrio() {
        return direccionBarrio;
    }

    public void setDireccionBarrio(String direccionBarrio) {
        this.direccionBarrio = direccionBarrio;
    }

    @Basic
    @Column(name = "direccionEntreCalles")
    public String getDireccionEntreCalles() {
        return direccionEntreCalles;
    }

    public void setDireccionEntreCalles(String direccionEntreCalles) {
        this.direccionEntreCalles = direccionEntreCalles;
    }

    @Basic
    @Column(name = "direccionDescripcion")
    public String getDireccionDescripcion() {
        return direccionDescripcion;
    }

    public void setDireccionDescripcion(String direccionDescripcion) {
        this.direccionDescripcion = direccionDescripcion;
    }

    @Basic
    @Column(name = "direccionFechaAlta")
    public Timestamp getDireccionFechaAlta() {
        return direccionFechaAlta;
    }

    public void setDireccionFechaAlta(Timestamp direccionFechaAlta) {
        this.direccionFechaAlta = direccionFechaAlta;
    }

    @Basic
    @Column(name = "direccionFechaActualizacion")
    public Timestamp getDireccionFechaActualizacion() {
        return direccionFechaActualizacion;
    }

    public void setDireccionFechaActualizacion(Timestamp direccionFechaActualizacion) {
        this.direccionFechaActualizacion = direccionFechaActualizacion;
    }

    @Basic
    @Column(name = "direccionFechaBaja")
    public Timestamp getDireccionFechaBaja() {
        return direccionFechaBaja;
    }

    public void setDireccionFechaBaja(Timestamp direccionFechaBaja) {
        this.direccionFechaBaja = direccionFechaBaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DireccionEntity that = (DireccionEntity) o;
        return Objects.equals(direccionId, that.direccionId) &&
                Objects.equals(direccionCalle, that.direccionCalle) &&
                Objects.equals(direccionNumero, that.direccionNumero) &&
                Objects.equals(direccionBarrio, that.direccionBarrio) &&
                Objects.equals(direccionEntreCalles, that.direccionEntreCalles) &&
                Objects.equals(direccionDescripcion, that.direccionDescripcion) &&
                Objects.equals(direccionFechaAlta, that.direccionFechaAlta) &&
                Objects.equals(direccionFechaActualizacion, that.direccionFechaActualizacion) &&
                Objects.equals(direccionFechaBaja, that.direccionFechaBaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccionId, direccionCalle, direccionNumero, direccionBarrio, direccionEntreCalles, direccionDescripcion, direccionFechaAlta, direccionFechaActualizacion, direccionFechaBaja);
    }

    @ManyToOne
    @JoinColumn(name = "clienteId", referencedColumnName = "clienteId")
    public ClienteEntity getClienteByClienteId() {
        return clienteByClienteId;
    }

    public void setClienteByClienteId(ClienteEntity clienteByClienteId) {
        this.clienteByClienteId = clienteByClienteId;
    }
}
