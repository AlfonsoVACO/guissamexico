/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guissa.guissa.models.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 4440s
 */
@Entity
@Table(name = "estados", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estados.findAll", query = "SELECT e FROM Estados e")
    , @NamedQuery(name = "Estados.findByIdEstado", query = "SELECT e FROM Estados e WHERE e.idEstado = :idEstado")
    , @NamedQuery(name = "Estados.findByNombre", query = "SELECT e FROM Estados e WHERE e.nombre = :nombre")})
public class Estados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdEstado")
    private Integer idEstado;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstado")
    private List<Producto> productoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstado")
    private List<Negocios> negociosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstado")
    private List<Evento> eventoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstado")
    private List<NegocioEs> negocioEsList;

    public Estados() {
    }

    public Estados(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Estados(Integer idEstado, String nombre) {
        this.idEstado = idEstado;
        this.nombre = nombre;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @XmlTransient
    public List<Negocios> getNegociosList() {
        return negociosList;
    }

    public void setNegociosList(List<Negocios> negociosList) {
        this.negociosList = negociosList;
    }

    @XmlTransient
    public List<Evento> getEventoList() {
        return eventoList;
    }

    public void setEventoList(List<Evento> eventoList) {
        this.eventoList = eventoList;
    }

    @XmlTransient
    public List<NegocioEs> getNegocioEsList() {
        return negocioEsList;
    }

    public void setNegocioEsList(List<NegocioEs> negocioEsList) {
        this.negocioEsList = negocioEsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estados)) {
            return false;
        }
        Estados other = (Estados) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Estados[ idEstado=" + idEstado + " ]";
    }
    
}
