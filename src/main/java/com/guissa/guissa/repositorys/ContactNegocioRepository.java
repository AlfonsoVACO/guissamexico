package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guissa.guissa.models.entidades.ContactNegocios;;

public interface ContactNegocioRepository  extends JpaRepository<ContactNegocios, Serializable>{

}
