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
@Table(name = "patrocinador", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patrocinador.findAll", query = "SELECT p FROM Patrocinador p")
    , @NamedQuery(name = "Patrocinador.findByIdPatrocinador", query = "SELECT p FROM Patrocinador p WHERE p.idPatrocinador = :idPatrocinador")
    , @NamedQuery(name = "Patrocinador.findByNombre", query = "SELECT p FROM Patrocinador p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Patrocinador.findByLocalizacion", query = "SELECT p FROM Patrocinador p WHERE p.localizacion = :localizacion")
    , @NamedQuery(name = "Patrocinador.findByWeb", query = "SELECT p FROM Patrocinador p WHERE p.web = :web")})
public class Patrocinador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPatrocinador")
    private Integer idPatrocinador;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Localizacion")
    private String localizacion;
    @Basic(optional = false)
    @Column(name = "Web")
    private String web;
    @Basic(optional = false)
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    @JoinColumn(name = "IdUser", referencedColumnName = "IdUser")
    @ManyToOne(optional = false)
    private User idUser;

    public Patrocinador() {
    }

    public Patrocinador(Integer idPatrocinador) {
        this.idPatrocinador = idPatrocinador;
    }

    public Patrocinador(Integer idPatrocinador, String nombre, String localizacion, String web, byte[] imagen) {
        this.idPatrocinador = idPatrocinador;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.web = web;
        this.imagen = imagen;
    }

    public Integer getIdPatrocinador() {
        return idPatrocinador;
    }

    public void setIdPatrocinador(Integer idPatrocinador) {
        this.idPatrocinador = idPatrocinador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
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
        hash += (idPatrocinador != null ? idPatrocinador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patrocinador)) {
            return false;
        }
        Patrocinador other = (Patrocinador) object;
        if ((this.idPatrocinador == null && other.idPatrocinador != null) || (this.idPatrocinador != null && !this.idPatrocinador.equals(other.idPatrocinador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Patrocinador[ idPatrocinador=" + idPatrocinador + " ]";
    }
    
}
