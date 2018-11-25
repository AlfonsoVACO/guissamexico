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
@Table(name = "galeria_ns", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GaleriaNs.findAll", query = "SELECT g FROM GaleriaNs g")
    , @NamedQuery(name = "GaleriaNs.findByIdImagen", query = "SELECT g FROM GaleriaNs g WHERE g.idImagen = :idImagen")
    , @NamedQuery(name = "GaleriaNs.findByNombre", query = "SELECT g FROM GaleriaNs g WHERE g.nombre = :nombre")
    , @NamedQuery(name = "GaleriaNs.findByNombreimg", query = "SELECT g FROM GaleriaNs g WHERE g.nombreimg = :nombreimg")
    , @NamedQuery(name = "GaleriaNs.findByTipo", query = "SELECT g FROM GaleriaNs g WHERE g.tipo = :tipo")})
public class GaleriaNs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdImagen")
    private Integer idImagen;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Nombre_img")
    private String nombreimg;
    @Basic(optional = false)
    @Column(name = "Tipo")
    private String tipo;
    @Basic(optional = false)
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    @JoinColumn(name = "IdNegocio", referencedColumnName = "IdNegocio")
    @ManyToOne(optional = false)
    private Negocios idNegocio;

    public GaleriaNs() {
    }

    public GaleriaNs(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public GaleriaNs(Integer idImagen, String nombre, String nombreimg, String tipo, byte[] imagen) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.nombreimg = nombreimg;
        this.tipo = tipo;
        this.imagen = imagen;
    }

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreimg() {
        return nombreimg;
    }

    public void setNombreimg(String nombreimg) {
        this.nombreimg = nombreimg;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
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
        hash += (idImagen != null ? idImagen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GaleriaNs)) {
            return false;
        }
        GaleriaNs other = (GaleriaNs) object;
        if ((this.idImagen == null && other.idImagen != null) || (this.idImagen != null && !this.idImagen.equals(other.idImagen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.GaleriaNs[ idImagen=" + idImagen + " ]";
    }
    
}
