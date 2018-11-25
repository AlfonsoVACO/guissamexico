package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.guissa.guissa.models.entidades.TipoUsuario;

@RepositoryRestResource(collectionResourceRel = "tipo_usuario", path="tipo_usuario")
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Serializable>{

}