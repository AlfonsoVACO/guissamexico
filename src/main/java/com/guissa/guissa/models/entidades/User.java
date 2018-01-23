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
import javax.persistence.Lob;
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
@Table(name = "user", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findByIdUser", query = "SELECT u FROM User u WHERE u.idUser = :idUser")
    , @NamedQuery(name = "User.findByNombre", query = "SELECT u FROM User u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "User.findByApellidos", query = "SELECT u FROM User u WHERE u.apellidos = :apellidos")
    , @NamedQuery(name = "User.findByCorreo", query = "SELECT u FROM User u WHERE u.correo = :correo")
    , @NamedQuery(name = "User.findByNic", query = "SELECT u FROM User u WHERE u.nic = :nic")
    , @NamedQuery(name = "User.findByPass", query = "SELECT u FROM User u WHERE u.pass = :pass")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdUser")
    private Integer idUser;
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
    @Column(name = "Nic")
    private String nic;
    @Basic(optional = false)
    @Column(name = "Pass")
    private String pass;
    @Basic(optional = false)
    @Lob
    @Column(name = "Avatar")
    private byte[] avatar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<Receta> recetaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<Notas> notasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<Producto> productoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<Negocios> negociosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<Evento> eventoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<Patrocinador> patrocinadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<Resetopass> resetopassList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<Banner> bannerList;
    @JoinColumn(name = "IdTipo_usuario", referencedColumnName = "id_tipo_usuario")
    @ManyToOne(optional = false)
    private TipoUsuario idTipousuario;

    public User() {
    }

    public User(Integer idUser) {
        this.idUser = idUser;
    }

    public User(Integer idUser, String nombre, String apellidos, String correo, String nic, String pass, byte[] avatar) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.nic = nic;
        this.pass = pass;
        this.avatar = avatar;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    @XmlTransient
    public List<Receta> getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(List<Receta> recetaList) {
        this.recetaList = recetaList;
    }

    @XmlTransient
    public List<Notas> getNotasList() {
        return notasList;
    }

    public void setNotasList(List<Notas> notasList) {
        this.notasList = notasList;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @XmlTransient
    public List<Negocios> getNegociosList() {
        return negociosList;
    }

    public void setNegociosList(List<Negocios> negociosList) {
        this.negociosList = negociosList;
    }

    @XmlTransient
    public List<Evento> getEventoList() {
        return eventoList;
    }

    public void setEventoList(List<Evento> eventoList) {
        this.eventoList = eventoList;
    }

    @XmlTransient
    public List<Patrocinador> getPatrocinadorList() {
        return patrocinadorList;
    }

    public void setPatrocinadorList(List<Patrocinador> patrocinadorList) {
        this.patrocinadorList = patrocinadorList;
    }

    @XmlTransient
    public List<Resetopass> getResetopassList() {
        return resetopassList;
    }

    public void setResetopassList(List<Resetopass> resetopassList) {
        this.resetopassList = resetopassList;
    }

    @XmlTransient
    public List<Banner> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<Banner> bannerList) {
        this.bannerList = bannerList;
    }

    public TipoUsuario getIdTipousuario() {
        return idTipousuario;
    }

    public void setIdTipousuario(TipoUsuario idTipousuario) {
        this.idTipousuario = idTipousuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.User[ idUser=" + idUser + " ]";
    }
    
}
