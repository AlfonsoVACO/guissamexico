package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.Replican;

@Repository("replicanRepository")
public interface ReplicaNRepository  extends JpaRepository<Replican, Serializable>{

}
