package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.guissa.guissa.models.entidades.Banner;
import com.guissa.guissa.models.entidades.TipoUsuario;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Serializable>{

}
