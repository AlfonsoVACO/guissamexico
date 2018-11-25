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
@Table(name = "comentariosp", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentariosp.findAll", query = "SELECT c FROM Comentariosp c")
    , @NamedQuery(name = "Comentariosp.findByIdComentario", query = "SELECT c FROM Comentariosp c WHERE c.idComentario = :idComentario")
    , @NamedQuery(name = "Comentariosp.findByNombre", query = "SELECT c FROM Comentariosp c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Comentariosp.findByFecha", query = "SELECT c FROM Comentariosp c WHERE c.fecha = :fecha")})
public class Comentariosp implements Serializable {

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
    @JoinColumn(name = "IdProducto", referencedColumnName = "IdProducto")
    @ManyToOne(optional = false)
    private Producto idProducto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idComentariosp")
    private List<Replicap> replicapList;

    public Comentariosp() {
    }

    public Comentariosp(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Comentariosp(Integer idComentario, String nombre, String comentario, Date fecha) {
        this.idComentario = idComentario;
        this.nombre = nombre;
        this.comentario = comentario;
        this.fecha = fecha;
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

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @XmlTransient
    public List<Replicap> getReplicapList() {
        return replicapList;
    }

    public void setReplicapList(List<Replicap> replicapList) {
        this.replicapList = replicapList;
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
        if (!(object instanceof Comentariosp)) {
            return false;
        }
        Comentariosp other = (Comentariosp) object;
        if ((this.idComentario == null && other.idComentario != null) || (this.idComentario != null && !this.idComentario.equals(other.idComentario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Comentariosp[ idComentario=" + idComentario + " ]";
    }
    
}
