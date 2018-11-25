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
import javax.persistence.Lob;
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
@Table(name = "temporadas", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Temporadas.findAll", query = "SELECT t FROM Temporadas t")
    , @NamedQuery(name = "Temporadas.findByIdTemporada", query = "SELECT t FROM Temporadas t WHERE t.idTemporada = :idTemporada")})
public class Temporadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTemporada")
    private Integer idTemporada;
    @Basic(optional = false)
    @Lob
    @Column(name = "DescripcionT")
    private String descripcionT;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTemporada")
    private List<Producto> productoList;

    public Temporadas() {
    }

    public Temporadas(Integer idTemporada) {
        this.idTemporada = idTemporada;
    }

    public Temporadas(Integer idTemporada, String descripcionT) {
        this.idTemporada = idTemporada;
        this.descripcionT = descripcionT;
    }

    public Integer getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Integer idTemporada) {
        this.idTemporada = idTemporada;
    }

    public String getDescripcionT() {
        return descripcionT;
    }

    public void setDescripcionT(String descripcionT) {
        this.descripcionT = descripcionT;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTemporada != null ? idTemporada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temporadas)) {
            return false;
        }
        Temporadas other = (Temporadas) object;
        if ((this.idTemporada == null && other.idTemporada != null) || (this.idTemporada != null && !this.idTemporada.equals(other.idTemporada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Temporadas[ idTemporada=" + idTemporada + " ]";
    }
    
}
