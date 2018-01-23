package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guissa.guissa.models.entidades.Precios;

public interface PreciosRepository  extends JpaRepository<Precios, Serializable>{

}
