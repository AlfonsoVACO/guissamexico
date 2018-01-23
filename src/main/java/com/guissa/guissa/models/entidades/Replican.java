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
@Table(name = "replican", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Replican.findAll", query = "SELECT r FROM Replican r")
    , @NamedQuery(name = "Replican.findByIdReplica", query = "SELECT r FROM Replican r WHERE r.idReplica = :idReplica")
    , @NamedQuery(name = "Replican.findByNombre", query = "SELECT r FROM Replican r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Replican.findByFecha", query = "SELECT r FROM Replican r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Replican.findByEstado", query = "SELECT r FROM Replican r WHERE r.estado = :estado")})
public class Replican implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdReplica")
    private Integer idReplica;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Lob
    @Column(name = "Replica")
    private String replica;
    @Basic(optional = false)
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "Estado")
    private int estado;
    @JoinColumn(name = "IdComentario", referencedColumnName = "IdComentario")
    @ManyToOne(optional = false)
    private Comentariosn idComentario;

    public Replican() {
    }

    public Replican(Integer idReplica) {
        this.idReplica = idReplica;
    }

    public Replican(Integer idReplica, String nombre, String replica, Date fecha, int estado) {
        this.idReplica = idReplica;
        this.nombre = nombre;
        this.replica = replica;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getIdReplica() {
        return idReplica;
    }

    public void setIdReplica(Integer idReplica) {
        this.idReplica = idReplica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReplica() {
        return replica;
    }

    public void setReplica(String replica) {
        this.replica = replica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Comentariosn getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Comentariosn idComentario) {
        this.idComentario = idComentario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReplica != null ? idReplica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Replican)) {
            return false;
        }
        Replican other = (Replican) object;
        if ((this.idReplica == null && other.idReplica != null) || (this.idReplica != null && !this.idReplica.equals(other.idReplica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Replican[ idReplica=" + idReplica + " ]";
    }
    
}
