package com.guissa.guissa.models.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "auditorias", catalog = "guissa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditorias.findAll", query = "SELECT a FROM Auditorias a")
    , @NamedQuery(name = "Auditorias.findById", query = "SELECT a FROM Auditorias a WHERE a.id = :id")
    , @NamedQuery(name = "Auditorias.findByTabla", query = "SELECT a FROM Auditorias a WHERE a.tabla = :tabla")
    , @NamedQuery(name = "Auditorias.findByFecha", query = "SELECT a FROM Auditorias a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "Auditorias.findByAccion", query = "SELECT a FROM Auditorias a WHERE a.accion = :accion")
    , @NamedQuery(name = "Auditorias.findBySesion", query = "SELECT a FROM Auditorias a WHERE a.sesion = :sesion")})
public class Auditorias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tabla")
    private String tabla;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "accion")
    private String accion;
    @Basic(optional = false)
    @Column(name = "sesion")
    private String sesion;

    public Auditorias() {
    }

    public Auditorias(Integer id) {
        this.id = id;
    }

    public Auditorias(Integer id, String tabla, Date fecha, String accion, String sesion) {
        this.id = id;
        this.tabla = tabla;
        this.fecha = fecha;
        this.accion = accion;
        this.sesion = sesion;
    }

    public Auditorias(String tabla, Date fecha, String accion, String sesion) {
		super();
		this.tabla = tabla;
		this.fecha = fecha;
		this.accion = accion;
		this.sesion = sesion;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getSesion() {
        return sesion;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditorias)) {
            return false;
        }
        Auditorias other = (Auditorias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "recursosdom.entidad.Auditorias[ id=" + id + " ]";
    }
    
}
