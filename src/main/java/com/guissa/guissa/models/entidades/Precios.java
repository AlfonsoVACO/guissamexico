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
@Table(name = "precios", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Precios.findAll", query = "SELECT p FROM Precios p")
    , @NamedQuery(name = "Precios.findByIdPrecio", query = "SELECT p FROM Precios p WHERE p.idPrecio = :idPrecio")
    , @NamedQuery(name = "Precios.findByPrecio", query = "SELECT p FROM Precios p WHERE p.precio = :precio")
    , @NamedQuery(name = "Precios.findByTipo", query = "SELECT p FROM Precios p WHERE p.tipo = :tipo")})
public class Precios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPrecio")
    private Integer idPrecio;
    @Basic(optional = false)
    @Column(name = "Precio")
    private double precio;
    @Basic(optional = false)
    @Column(name = "Tipo")
    private int tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrecio")
    private List<NegocioEs> negocioEsList;

    public Precios() {
    }

    public Precios(Integer idPrecio) {
        this.idPrecio = idPrecio;
    }

    public Precios(Integer idPrecio, double precio, int tipo) {
        this.idPrecio = idPrecio;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Integer getIdPrecio() {
        return idPrecio;
    }

    public void setIdPrecio(Integer idPrecio) {
        this.idPrecio = idPrecio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
        hash += (idPrecio != null ? idPrecio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Precios)) {
            return false;
        }
        Precios other = (Precios) object;
        if ((this.idPrecio == null && other.idPrecio != null) || (this.idPrecio != null && !this.idPrecio.equals(other.idPrecio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Precios[ idPrecio=" + idPrecio + " ]";
    }
    
}
