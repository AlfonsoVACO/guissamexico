package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guissa.guissa.models.entidades.Notas;

public interface NotasRepository  extends JpaRepository<Notas, Serializable>{

}
