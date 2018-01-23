/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guissa.guissa.models.entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 4440s
 */
@Entity
@Table(name = "evento", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")
    , @NamedQuery(name = "Evento.findByIdEvento", query = "SELECT e FROM Evento e WHERE e.idEvento = :idEvento")
    , @NamedQuery(name = "Evento.findByNombre", query = "SELECT e FROM Evento e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Evento.findByFechaI", query = "SELECT e FROM Evento e WHERE e.fechaI = :fechaI")
    , @NamedQuery(name = "Evento.findByFechaF", query = "SELECT e FROM Evento e WHERE e.fechaF = :fechaF")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdEvento")
    private Integer idEvento;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Lob
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "FechaI")
    @Temporal(TemporalType.DATE)
    private Date fechaI;
    @Basic(optional = false)
    @Column(name = "FechaF")
    @Temporal(TemporalType.DATE)
    private Date fechaF;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEvento")
    private List<Comentariose> comentarioseList;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne(optional = false)
    private Estados idEstado;
    @JoinColumn(name = "IdImagen", referencedColumnName = "IdImagen")
    @ManyToOne(optional = false)
    private Imagenev idImagen;
    @JoinColumn(name = "IdMunicipio", referencedColumnName = "IdMunicipio")
    @ManyToOne(optional = false)
    private Municipios idMunicipio;
    @JoinColumn(name = "IdUser", referencedColumnName = "IdUser")
    @ManyToOne(optional = false)
    private User idUser;

    public Evento() {
    }

    public Evento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Evento(Integer idEvento, String nombre, String descripcion, Date fechaI, Date fechaF) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaI() {
        return fechaI;
    }

    public void setFechaI(Date fechaI) {
        this.fechaI = fechaI;
    }

    public Date getFechaF() {
        return fechaF;
    }

    public void setFechaF(Date fechaF) {
        this.fechaF = fechaF;
    }

    @XmlTransient
    public List<Comentariose> getComentarioseList() {
        return comentarioseList;
    }

    public void setComentarioseList(List<Comentariose> comentarioseList) {
        this.comentarioseList = comentarioseList;
    }

    public Estados getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estados idEstado) {
        this.idEstado = idEstado;
    }

    public Imagenev getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Imagenev idImagen) {
        this.idImagen = idImagen;
    }

    public Municipios getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipios idMunicipio) {
        this.idMunicipio = idMunicipio;
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
        hash += (idEvento != null ? idEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.idEvento == null && other.idEvento != null) || (this.idEvento != null && !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Evento[ idEvento=" + idEvento + " ]";
    }
    
}
