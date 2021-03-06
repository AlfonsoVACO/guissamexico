package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.Municipios;

@Repository("municipiosRepository")
public interface MunicipiosRepository  extends JpaRepository<Municipios, Serializable>{

}
