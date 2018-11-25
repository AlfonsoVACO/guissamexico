/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guissa.guissa.models.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 4440s
 */
@Entity
@Table(name = "comentariosn", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentariosn.findAll", query = "SELECT c FROM Comentariosn c")
    , @NamedQuery(name = "Comentariosn.findByIdComentario", query = "SELECT c FROM Comentariosn c WHERE c.idComentario = :idComentario")
    , @NamedQuery(name = "Comentariosn.findByNombre", query = "SELECT c FROM Comentariosn c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Comentariosn.findByFecha", query = "SELECT c FROM Comentariosn c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Comentariosn.findByEstado", query = "SELECT c FROM Comentariosn c WHERE c.estado = :estado")})
public class Comentariosn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdComentario")
    private Integer idComentario;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Lob
    @Column(name = "Comentario")
    private String comentario;
    @Basic(optional = false)
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "Estado")
    private int estado;
    @JoinColumn(name = "IdNegocio", referencedColumnName = "IdNegocio")
    @ManyToOne(optional = false)
    private Negocios idNegocio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idComentario")
    private List<Replican> replicanList;

    public Comentariosn() {
    }

    public Comentariosn(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Comentariosn(Integer idComentario, String nombre, String comentario, Date fecha, int estado) {
        this.idComentario = idComentario;
        this.nombre = nombre;
        this.comentario = comentario;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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

    public Negocios getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Negocios idNegocio) {
        this.idNegocio = idNegocio;
    }

    @XmlTransient
    public List<Replican> getReplicanList() {
        return replicanList;
    }

    public void setReplicanList(List<Replican> replicanList) {
        this.replicanList = replicanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComentario != null ? idComentario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comentariosn)) {
            return false;
        }
        Comentariosn other = (Comentariosn) object;
        if ((this.idComentario == null && other.idComentario != null) || (this.idComentario != null && !this.idComentario.equals(other.idComentario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Comentariosn[ idComentario=" + idComentario + " ]";
    }
    
}
