package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guissa.guissa.models.entidades.Tipo;

public interface TipoRepository  extends JpaRepository<Tipo, Serializable>{

}
