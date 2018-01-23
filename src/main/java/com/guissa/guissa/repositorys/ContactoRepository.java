package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guissa.guissa.models.entidades.Contacto;

public interface ContactoRepository  extends JpaRepository<Contacto, Serializable>{

}
