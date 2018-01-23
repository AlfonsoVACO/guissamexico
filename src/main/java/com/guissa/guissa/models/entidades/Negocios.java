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
@Table(name = "negocios", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Negocios.findAll", query = "SELECT n FROM Negocios n")
    , @NamedQuery(name = "Negocios.findByIdNegocio", query = "SELECT n FROM Negocios n WHERE n.idNegocio = :idNegocio")
    , @NamedQuery(name = "Negocios.findByNombre", query = "SELECT n FROM Negocios n WHERE n.nombre = :nombre")
    , @NamedQuery(name = "Negocios.findByDireccion", query = "SELECT n FROM Negocios n WHERE n.direccion = :direccion")
    , @NamedQuery(name = "Negocios.findByTelefono", query = "SELECT n FROM Negocios n WHERE n.telefono = :telefono")
    , @NamedQuery(name = "Negocios.findByTelefono2", query = "SELECT n FROM Negocios n WHERE n.telefono2 = :telefono2")
    , @NamedQuery(name = "Negocios.findByVisualizacion", query = "SELECT n FROM Negocios n WHERE n.visualizacion = :visualizacion")
    , @NamedQuery(name = "Negocios.findByEstado", query = "SELECT n FROM Negocios n WHERE n.estado = :estado")
    , @NamedQuery(name = "Negocios.findByFecha", query = "SELECT n FROM Negocios n WHERE n.fecha = :fecha")})
public class Negocios implements Serializable {

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
    @Column(name = "Telefono2")
    private String telefono2;
    @Basic(optional = false)
    @Lob
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Visualizacion")
    private int visualizacion;
    @Basic(optional = false)
    @Column(name = "Estado")
    private int estado;
    @Basic(optional = false)
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNegocio")
    private List<Imagennegocios> imagennegociosList;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne(optional = false)
    private Estados idEstado;
    @JoinColumn(name = "IdMunicipio", referencedColumnName = "IdMunicipio")
    @ManyToOne(optional = false)
    private Municipios idMunicipio;
    @JoinColumn(name = "IdUser", referencedColumnName = "IdUser")
    @ManyToOne(optional = false)
    private User idUser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNegocio")
    private List<Comentariosn> comentariosnList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNegocio")
    private List<Menurestaurante> menurestauranteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNegocio")
    private List<Userc> usercList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNegocio")
    private List<ContactNegocios> contactNegociosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNegocio")
    private List<GaleriaNs> galeriaNsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNegocio")
    private List<Reservacion> reservacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNegocio")
    private List<Reservags> reservagsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNegocio")
    private List<Comun> comunList;

    public Negocios() {
    }

    public Negocios(Integer idNegocio) {
        this.idNegocio = idNegocio;
    }

    public Negocios(Integer idNegocio, String nombre, String direccion, String telefono, String descripcion, int visualizacion, int estado, Date fecha) {
        this.idNegocio = idNegocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.visualizacion = visualizacion;
        this.estado = estado;
        this.fecha = fecha;
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

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<Imagennegocios> getImagennegociosList() {
        return imagennegociosList;
    }

    public void setImagennegociosList(List<Imagennegocios> imagennegociosList) {
        this.imagennegociosList = imagennegociosList;
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

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @XmlTransient
    public List<Comentariosn> getComentariosnList() {
        return comentariosnList;
    }

    public void setComentariosnList(List<Comentariosn> comentariosnList) {
        this.comentariosnList = comentariosnList;
    }

    @XmlTransient
    public List<Menurestaurante> getMenurestauranteList() {
        return menurestauranteList;
    }

    public void setMenurestauranteList(List<Menurestaurante> menurestauranteList) {
        this.menurestauranteList = menurestauranteList;
    }

    @XmlTransient
    public List<Userc> getUsercList() {
        return usercList;
    }

    public void setUsercList(List<Userc> usercList) {
        this.usercList = usercList;
    }

    @XmlTransient
    public List<ContactNegocios> getContactNegociosList() {
        return contactNegociosList;
    }

    public void setContactNegociosList(List<ContactNegocios> contactNegociosList) {
        this.contactNegociosList = contactNegociosList;
    }

    @XmlTransient
    public List<GaleriaNs> getGaleriaNsList() {
        return galeriaNsList;
    }

    public void setGaleriaNsList(List<GaleriaNs> galeriaNsList) {
        this.galeriaNsList = galeriaNsList;
    }

    @XmlTransient
    public List<Reservacion> getReservacionList() {
        return reservacionList;
    }

    public void setReservacionList(List<Reservacion> reservacionList) {
        this.reservacionList = reservacionList;
    }

    @XmlTransient
    public List<Reservags> getReservagsList() {
        return reservagsList;
    }

    public void setReservagsList(List<Reservags> reservagsList) {
        this.reservagsList = reservagsList;
    }

    @XmlTransient
    public List<Comun> getComunList() {
        return comunList;
    }

    public void setComunList(List<Comun> comunList) {
        this.comunList = comunList;
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
        if (!(object instanceof Negocios)) {
            return false;
        }
        Negocios other = (Negocios) object;
        if ((this.idNegocio == null && other.idNegocio != null) || (this.idNegocio != null && !this.idNegocio.equals(other.idNegocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Negocios[ idNegocio=" + idNegocio + " ]";
    }
    
}
