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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 4440s
 */
@Entity
@Table(name = "historys", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historys.findAll", query = "SELECT h FROM Historys h")
    , @NamedQuery(name = "Historys.findByIdHistory", query = "SELECT h FROM Historys h WHERE h.idHistory = :idHistory")
    , @NamedQuery(name = "Historys.findByNombreH", query = "SELECT h FROM Historys h WHERE h.nombreH = :nombreH")
    , @NamedQuery(name = "Historys.findByNombre", query = "SELECT h FROM Historys h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Historys.findByTipo", query = "SELECT h FROM Historys h WHERE h.tipo = :tipo")
    , @NamedQuery(name = "Historys.findByTemporada", query = "SELECT h FROM Historys h WHERE h.temporada = :temporada")
    , @NamedQuery(name = "Historys.findByMunicipio", query = "SELECT h FROM Historys h WHERE h.municipio = :municipio")
    , @NamedQuery(name = "Historys.findByEstado", query = "SELECT h FROM Historys h WHERE h.estado = :estado")})
public class Historys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdHistory")
    private Integer idHistory;
    @Basic(optional = false)
    @Column(name = "NombreH")
    private String nombreH;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "Temporada")
    private String temporada;
    @Basic(optional = false)
    @Column(name = "Municipio")
    private String municipio;
    @Basic(optional = false)
    @Lob
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Estado")
    private int estado;

    public Historys() {
    }

    public Historys(Integer idHistory) {
        this.idHistory = idHistory;
    }

    public Historys(Integer idHistory, String nombreH, String nombre, String tipo, String temporada, String municipio, String descripcion, int estado) {
        this.idHistory = idHistory;
        this.nombreH = nombreH;
        this.nombre = nombre;
        this.tipo = tipo;
        this.temporada = temporada;
        this.municipio = municipio;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(Integer idHistory) {
        this.idHistory = idHistory;
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistory != null ? idHistory.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historys)) {
            return false;
        }
        Historys other = (Historys) object;
        if ((this.idHistory == null && other.idHistory != null) || (this.idHistory != null && !this.idHistory.equals(other.idHistory))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Historys[ idHistory=" + idHistory + " ]";
    }
    
}
