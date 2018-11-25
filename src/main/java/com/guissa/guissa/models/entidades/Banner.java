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
@Table(name = "banner", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banner.findAll", query = "SELECT b FROM Banner b")
    , @NamedQuery(name = "Banner.findByIdBanner", query = "SELECT b FROM Banner b WHERE b.idBanner = :idBanner")
    , @NamedQuery(name = "Banner.findByNombre", query = "SELECT b FROM Banner b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "Banner.findBySubTitle", query = "SELECT b FROM Banner b WHERE b.subTitle = :subTitle")})
public class Banner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdBanner")
    private Integer idBanner;
    @Basic(optional = false)
    @Column(name = "Nombre")
    public String nombre;
    @Basic(optional = false)
    @Column(name = "SubTitle")
    public String subTitle;
    @Basic(optional = false)
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    @JoinColumn(name = "IdUser", referencedColumnName = "IdUser")
    @ManyToOne(optional = false)
    private User idUser;

    public Banner() {
    }

    public Banner(Integer idBanner) {
        this.idBanner = idBanner;
    }

    public Banner(Integer idBanner, String nombre, String subTitle, byte[] imagen) {
        this.idBanner = idBanner;
        this.nombre = nombre;
        this.subTitle = subTitle;
        this.imagen = imagen;
    }

    public Integer getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(Integer idBanner) {
        this.idBanner = idBanner;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBanner != null ? idBanner.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banner)) {
            return false;
        }
        Banner other = (Banner) object;
        if ((this.idBanner == null && other.idBanner != null) || (this.idBanner != null && !this.idBanner.equals(other.idBanner))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Banner[ idBanner=" + idBanner + " ]";
    }
    
}
