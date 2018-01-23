package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guissa.guissa.models.entidades.Receta;

public interface RecetaRepository  extends JpaRepository<Receta, Serializable>{

}
