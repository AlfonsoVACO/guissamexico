/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guissa.guissa.models.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 4440s
 */
@Entity
@Table(name = "resetopass", catalog = "guissamexico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resetopass.findAll", query = "SELECT r FROM Resetopass r")
    , @NamedQuery(name = "Resetopass.findByIdResetoPass", query = "SELECT r FROM Resetopass r WHERE r.idResetoPass = :idResetoPass")
    , @NamedQuery(name = "Resetopass.findByNick", query = "SELECT r FROM Resetopass r WHERE r.nick = :nick")
    , @NamedQuery(name = "Resetopass.findByToken", query = "SELECT r FROM Resetopass r WHERE r.token = :token")
    , @NamedQuery(name = "Resetopass.findByCreado", query = "SELECT r FROM Resetopass r WHERE r.creado = :creado")})
public class Resetopass implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdResetoPass")
    private Integer idResetoPass;
    @Basic(optional = false)
    @Column(name = "Nick")
    private String nick;
    @Basic(optional = false)
    @Column(name = "Token")
    private String token;
    @Basic(optional = false)
    @Column(name = "Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creado;
    @JoinColumn(name = "IdUser", referencedColumnName = "IdUser")
    @ManyToOne(optional = false)
    private User idUser;

    public Resetopass() {
    }

    public Resetopass(Integer idResetoPass) {
        this.idResetoPass = idResetoPass;
    }

    public Resetopass(Integer idResetoPass, String nick, String token, Date creado) {
        this.idResetoPass = idResetoPass;
        this.nick = nick;
        this.token = token;
        this.creado = creado;
    }

    public Integer getIdResetoPass() {
        return idResetoPass;
    }

    public void setIdResetoPass(Integer idResetoPass) {
        this.idResetoPass = idResetoPass;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
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
        hash += (idResetoPass != null ? idResetoPass.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resetopass)) {
            return false;
        }
        Resetopass other = (Resetopass) object;
        if ((this.idResetoPass == null && other.idResetoPass != null) || (this.idResetoPass != null && !this.idResetoPass.equals(other.idResetoPass))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guissa.guissa.models.entidades.Resetopass[ idResetoPass=" + idResetoPass + " ]";
    }
    
}
