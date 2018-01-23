/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guissa.guissa.models.entidades;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 4440s
 */
@Entity
@Table(name = "imagenmenurestaurante", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imagenmenurestaurante.findAll", query = "SELECT i FROM Imagenmenurestaurante i")
    , @NamedQuery(name = "Imagenmenurestaurante.findByIdImagen", query = "SELECT i FROM Imagenmenurestaurante i WHERE i.idImagen = :idImagen")})
public class Imagenmenurestaurante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idImagen")
    private Integer idImagen;
    @Basic(optional = false)
    @Lob
    @Column(name = "imagen")
    private byte[] imagen;
    @JoinColumn(name = "idItem", referencedColumnName = "idItem")
    @ManyToOne(optional = false)
    private Menurestaurante idItem;

    public Imagenmenurestaurante() {
    }

    public Imagenmenurestaurante(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public Imagenmenurestaurante(Integer idImagen, byte[] imagen) {
        this.idImagen = idImagen;
        this.imagen = imagen;
    }

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Menurestaurante getIdItem() {
        return idItem;
    }

    public void setIdItem(Menurestaurante idItem) {
        this.idItem = idItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImagen != null ? idImagen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imagenmenurestaurante)) {
            return false;
        }
        Imagenmenurestaurante other = (Imagenmenurestaurante) object;
        if ((this.idImagen == null && other.idImagen != null) || (this.idImagen != null && !this.idImagen.equals(other.idImagen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Imagenmenurestaurante[ idImagen=" + idImagen + " ]";
    }
    
}
