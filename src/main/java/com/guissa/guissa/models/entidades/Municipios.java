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
@Table(name = "municipios", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Municipios.findAll", query = "SELECT m FROM Municipios m")
    , @NamedQuery(name = "Municipios.findByIdMunicipio", query = "SELECT m FROM Municipios m WHERE m.idMunicipio = :idMunicipio")
    , @NamedQuery(name = "Municipios.findByNombreMun", query = "SELECT m FROM Municipios m WHERE m.nombreMun = :nombreMun")})
public class Municipios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdMunicipio")
    private Integer idMunicipio;
    @Basic(optional = false)
    @Column(name = "Nombre_Mun")
    private String nombreMun;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipio")
    private List<Producto> productoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipio")
    private List<Negocios> negociosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipio")
    private List<Evento> eventoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipio")
    private List<NegocioEs> negocioEsList;

    public Municipios() {
    }

    public Municipios(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Municipios(Integer idMunicipio, String nombreMun) {
        this.idMunicipio = idMunicipio;
        this.nombreMun = nombreMun;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombreMun() {
        return nombreMun;
    }

    public void setNombreMun(String nombreMun) {
        this.nombreMun = nombreMun;
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
        hash += (idMunicipio != null ? idMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipios)) {
            return false;
        }
        Municipios other = (Municipios) object;
        if ((this.idMunicipio == null && other.idMunicipio != null) || (this.idMunicipio != null && !this.idMunicipio.equals(other.idMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Municipios[ idMunicipio=" + idMunicipio + " ]";
    }
    
}
