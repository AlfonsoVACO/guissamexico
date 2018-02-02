package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.User;

@Repository("sesionRepository")
public interface SesionRepository  extends JpaRepository<User, Serializable>{
	public abstract User findUserByCorreo(String correo);
}
