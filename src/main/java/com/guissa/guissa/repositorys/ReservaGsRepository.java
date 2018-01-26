package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.Reservags;

@Repository("recervagsRepository")
public interface ReservaGsRepository  extends JpaRepository<Reservags, Serializable>{

}
