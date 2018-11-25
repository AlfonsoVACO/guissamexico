/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guissa.guissa.models.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 4440s
 */
@Entity
@Table(name = "reservacion", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservacion.findAll", query = "SELECT r FROM Reservacion r")
    , @NamedQuery(name = "Reservacion.findByIdReservacion", query = "SELECT r FROM Reservacion r WHERE r.idReservacion = :idReservacion")
    , @NamedQuery(name = "Reservacion.findByFechaI", query = "SELECT r FROM Reservacion r WHERE r.fechaI = :fechaI")
    , @NamedQuery(name = "Reservacion.findByFechaT", query = "SELECT r FROM Reservacion r WHERE r.fechaT = :fechaT")
    , @NamedQuery(name = "Reservacion.findByActivo", query = "SELECT r FROM Reservacion r WHERE r.activo = :activo")})
public class Reservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdReservacion")
    private Integer idReservacion;
    @Basic(optional = false)
    @Lob
    @Column(name = "Pedido")
    private String pedido;
    @Basic(optional = false)
    @Column(name = "FechaI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaI;
    @Basic(optional = false)
    @Column(name = "FechaT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaT;
    @Basic(optional = false)
    @Column(name = "Activo")
    private short activo;
    @JoinColumn(name = "IdNegocio", referencedColumnName = "IdNegocio")
    @ManyToOne(optional = false)
    private Negocios idNegocio;
    @JoinColumn(name = "IdUserC", referencedColumnName = "IdUserC")
    @ManyToOne(optional = false)
    private Userc idUserC;

    public Reservacion() {
    }

    public Reservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Reservacion(Integer idReservacion, String pedido, Date fechaI, Date fechaT, short activo) {
        this.idReservacion = idReservacion;
        this.pedido = pedido;
        this.fechaI = fechaI;
        this.fechaT = fechaT;
        this.activo = activo;
    }

    public Integer getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public Date getFechaI() {
        return fechaI;
    }

    public void setFechaI(Date fechaI) {
        this.fechaI = fechaI;
    }

    public Date getFechaT() {
        return fechaT;
    }

    public void setFechaT(Date fechaT) {
        this.fechaT = fechaT;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public Negocios getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Negocios idNegocio) {
        this.idNegocio = idNegocio;
    }

    public Userc getIdUserC() {
        return idUserC;
    }

    public void setIdUserC(Userc idUserC) {
        this.idUserC = idUserC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReservacion != null ? idReservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservacion)) {
            return false;
        }
        Reservacion other = (Reservacion) object;
        if ((this.idReservacion == null && other.idReservacion != null) || (this.idReservacion != null && !this.idReservacion.equals(other.idReservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Reservacion[ idReservacion=" + idReservacion + " ]";
    }
    
}
