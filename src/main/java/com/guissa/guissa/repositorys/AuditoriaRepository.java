package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.Auditorias;

@Repository("auditoriaRepository")
public interface AuditoriaRepository extends JpaRepository<Auditorias, Serializable>{

}
