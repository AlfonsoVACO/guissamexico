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
@Table(name = "negocio_es", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NegocioEs.findAll", query = "SELECT n FROM NegocioEs n")
    , @NamedQuery(name = "NegocioEs.findByIdNegocio", query = "SELECT n FROM NegocioEs n WHERE n.idNegocio = :idNegocio")
    , @NamedQuery(name = "NegocioEs.findByNombre", query = "SELECT n FROM NegocioEs n WHERE n.nombre = :nombre")
    , @NamedQuery(name = "NegocioEs.findByDireccion", query = "SELECT n FROM NegocioEs n WHERE n.direccion = :direccion")
    , @NamedQuery(name = "NegocioEs.findByTelefono", query = "SELECT n FROM NegocioEs n WHERE n.telefono = :telefono")
    , @NamedQuery(name = "NegocioEs.findByOTelefono", query = "SELECT n FROM NegocioEs n WHERE n.oTelefono = :oTelefono")
    , @NamedQuery(name = "NegocioEs.findByCorreo", query = "SELECT n FROM NegocioEs n WHERE n.correo = :correo")
    , @NamedQuery(name = "NegocioEs.findByVisualizacion", query = "SELECT n FROM NegocioEs n WHERE n.visualizacion = :visualizacion")})
public class NegocioEs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdNegocio")
    private Integer idNegocio;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "OTelefono")
    private String oTelefono;
    @Basic(optional = false)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @Lob
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Visualizacion")
    private int visualizacion;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne(optional = false)
    private Estados idEstado;
    @JoinColumn(name = "IdMunicipio", referencedColumnName = "IdMunicipio")
    @ManyToOne(optional = false)
    private Municipios idMunicipio;
    @JoinColumn(name = "IdPrecio", referencedColumnName = "IdPrecio")
    @ManyToOne(optional = false)
    private Precios idPrecio;

    public NegocioEs() {
    }

    public NegocioEs(Integer idNegocio) {
        this.idNegocio = idNegocio;
    }

    public NegocioEs(Integer idNegocio, String nombre, String direccion, String telefono, String correo, String descripcion, int visualizacion) {
        this.idNegocio = idNegocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.descripcion = descripcion;
        this.visualizacion = visualizacion;
    }

    public Integer getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Integer idNegocio) {
        this.idNegocio = idNegocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOTelefono() {
        return oTelefono;
    }

    public void setOTelefono(String oTelefono) {
        this.oTelefono = oTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVisualizacion() {
        return visualizacion;
    }

    public void setVisualizacion(int visualizacion) {
        this.visualizacion = visualizacion;
    }

    public Estados getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estados idEstado) {
        this.idEstado = idEstado;
    }

    public Municipios getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipios idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Precios getIdPrecio() {
        return idPrecio;
    }

    public void setIdPrecio(Precios idPrecio) {
        this.idPrecio = idPrecio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNegocio != null ? idNegocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NegocioEs)) {
            return false;
        }
        NegocioEs other = (NegocioEs) object;
        if ((this.idNegocio == null && other.idNegocio != null) || (this.idNegocio != null && !this.idNegocio.equals(other.idNegocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.NegocioEs[ idNegocio=" + idNegocio + " ]";
    }
    
}
