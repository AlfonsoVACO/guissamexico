package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guissa.guissa.models.entidades.Comun;

public interface ComunRepository  extends JpaRepository<Comun, Serializable>{

}
