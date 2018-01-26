package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.GaleriaNs;;

@Repository("galeriaNRepository")
public interface GaleriaNRepository  extends JpaRepository<GaleriaNs, Serializable>{

}
