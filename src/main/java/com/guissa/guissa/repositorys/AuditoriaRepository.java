package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.Auditoria;

@Repository("auditoriaRepository")
public interface AuditoriaRepository extends JpaRepository<Auditoria, Serializable>{

}
