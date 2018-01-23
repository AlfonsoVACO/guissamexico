package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.Comentariose;

@Repository("comentarioeRepository")
public interface ComentariosERepository  extends JpaRepository<Comentariose, Serializable>{

}
