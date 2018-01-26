package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.Galeria;

@Repository("galeriaRepository")
public interface GeleriaRepository  extends JpaRepository<Galeria, Serializable>{

}
