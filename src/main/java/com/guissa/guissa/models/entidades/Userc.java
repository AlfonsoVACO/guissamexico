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
@Table(name = "userc", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userc.findAll", query = "SELECT u FROM Userc u")
    , @NamedQuery(name = "Userc.findByIdUserC", query = "SELECT u FROM Userc u WHERE u.idUserC = :idUserC")
    , @NamedQuery(name = "Userc.findByNombre", query = "SELECT u FROM Userc u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Userc.findByApellidos", query = "SELECT u FROM Userc u WHERE u.apellidos = :apellidos")
    , @NamedQuery(name = "Userc.findByCorreo", query = "SELECT u FROM Userc u WHERE u.correo = :correo")
    , @NamedQuery(name = "Userc.findByTelefono", query = "SELECT u FROM Userc u WHERE u.telefono = :telefono")
    , @NamedQuery(name = "Userc.findByDireccion", query = "SELECT u FROM Userc u WHERE u.direccion = :direccion")})
public class Userc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdUserC")
    private Integer idUserC;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Apellidos")
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "Telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "Direccion")
    private String direccion;
    @JoinColumn(name = "IdNegocio", referencedColumnName = "IdNegocio")
    @ManyToOne(optional = false)
    private Negocios idNegocio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUserC")
    private List<Reservacion> reservacionList;

    public Userc() {
    }

    public Userc(Integer idUserC) {
        this.idUserC = idUserC;
    }

    public Userc(Integer idUserC, String nombre, String apellidos, String correo, String telefono, String direccion) {
        this.idUserC = idUserC;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Integer getIdUserC() {
        return idUserC;
    }

    public void setIdUserC(Integer idUserC) {
        this.idUserC = idUserC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Negocios getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Negocios idNegocio) {
        this.idNegocio = idNegocio;
    }

    @XmlTransient
    public List<Reservacion> getReservacionList() {
        return reservacionList;
    }

    public void setReservacionList(List<Reservacion> reservacionList) {
        this.reservacionList = reservacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserC != null ? idUserC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userc)) {
            return false;
        }
        Userc other = (Userc) object;
        if ((this.idUserC == null && other.idUserC != null) || (this.idUserC != null && !this.idUserC.equals(other.idUserC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Userc[ idUserC=" + idUserC + " ]";
    }
    
}
