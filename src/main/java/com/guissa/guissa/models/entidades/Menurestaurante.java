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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "menurestaurante", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menurestaurante.findAll", query = "SELECT m FROM Menurestaurante m")
    , @NamedQuery(name = "Menurestaurante.findByIdItem", query = "SELECT m FROM Menurestaurante m WHERE m.idItem = :idItem")
    , @NamedQuery(name = "Menurestaurante.findByNombre", query = "SELECT m FROM Menurestaurante m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Menurestaurante.findByPrecio", query = "SELECT m FROM Menurestaurante m WHERE m.precio = :precio")
    , @NamedQuery(name = "Menurestaurante.findByCategoria", query = "SELECT m FROM Menurestaurante m WHERE m.categoria = :categoria")})
public class Menurestaurante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idItem")
    private Integer idItem;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Lob
    @Column(name = "menu")
    private String menu;
    @Basic(optional = false)
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idItem")
    private List<Imagenmenurestaurante> imagenmenurestauranteList;
    @JoinColumn(name = "idNegocio", referencedColumnName = "IdNegocio")
    @ManyToOne(optional = false)
    private Negocios idNegocio;

    public Menurestaurante() {
    }

    public Menurestaurante(Integer idItem) {
        this.idItem = idItem;
    }

    public Menurestaurante(Integer idItem, String nombre, String menu, double precio, String categoria) {
        this.idItem = idItem;
        this.nombre = nombre;
        this.menu = menu;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @XmlTransient
    public List<Imagenmenurestaurante> getImagenmenurestauranteList() {
        return imagenmenurestauranteList;
    }

    public void setImagenmenurestauranteList(List<Imagenmenurestaurante> imagenmenurestauranteList) {
        this.imagenmenurestauranteList = imagenmenurestauranteList;
    }

    public Negocios getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Negocios idNegocio) {
        this.idNegocio = idNegocio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idItem != null ? idItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menurestaurante)) {
            return false;
        }
        Menurestaurante other = (Menurestaurante) object;
        if ((this.idItem == null && other.idItem != null) || (this.idItem != null && !this.idItem.equals(other.idItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Menurestaurante[ idItem=" + idItem + " ]";
    }
    
}
