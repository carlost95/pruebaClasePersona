package com.undec.corralon.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cliente", schema = "santo_domigo_corralon", catalog = "")
public class ClienteEntity {
    private Integer clienteId;
    private String clienteNombre;
    private String clienteApellido;
    private String clienteDni;
    private Byte clienteHabilitacion;
    private Timestamp clienteFechaAlta;
    private Timestamp clienteFechaActualizacion;
    private Timestamp clienteFechaBaja;

    @Id
    @Column(name = "clienteId")
    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    @Basic
    @Column(name = "clienteNombre")
    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    @Basic
    @Column(name = "clienteApellido")
    public String getClienteApellido() {
        return clienteApellido;
    }

    public void setClienteApellido(String clienteApellido) {
        this.clienteApellido = clienteApellido;
    }

    @Basic
    @Column(name = "clienteDni")
    public String getClienteDni() {
        return clienteDni;
    }

    public void setClienteDni(String clienteDni) {
        this.clienteDni = clienteDni;
    }

    @Basic
    @Column(name = "clienteHabilitacion")
    public Byte getClienteHabilitacion() {
        return clienteHabilitacion;
    }

    public void setClienteHabilitacion(Byte clienteHabilitacion) {
        this.clienteHabilitacion = clienteHabilitacion;
    }

    @Basic
    @Column(name = "clienteFechaAlta")
    public Timestamp getClienteFechaAlta() {
        return clienteFechaAlta;
    }

    public void setClienteFechaAlta(Timestamp clienteFechaAlta) {
        this.clienteFechaAlta = clienteFechaAlta;
    }

    @Basic
    @Column(name = "clienteFechaActualizacion")
    public Timestamp getClienteFechaActualizacion() {
        return clienteFechaActualizacion;
    }

    public void setClienteFechaActualizacion(Timestamp clienteFechaActualizacion) {
        this.clienteFechaActualizacion = clienteFechaActualizacion;
    }

    @Basic
    @Column(name = "clienteFechaBaja")
    public Timestamp getClienteFechaBaja() {
        return clienteFechaBaja;
    }

    public void setClienteFechaBaja(Timestamp clienteFechaBaja) {
        this.clienteFechaBaja = clienteFechaBaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return Objects.equals(clienteId, that.clienteId) &&
                Objects.equals(clienteNombre, that.clienteNombre) &&
                Objects.equals(clienteApellido, that.clienteApellido) &&
                Objects.equals(clienteDni, that.clienteDni) &&
                Objects.equals(clienteHabilitacion, that.clienteHabilitacion) &&
                Objects.equals(clienteFechaAlta, that.clienteFechaAlta) &&
                Objects.equals(clienteFechaActualizacion, that.clienteFechaActualizacion) &&
                Objects.equals(clienteFechaBaja, that.clienteFechaBaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clienteId, clienteNombre, clienteApellido, clienteDni, clienteHabilitacion, clienteFechaAlta, clienteFechaActualizacion, clienteFechaBaja);
    }
}
