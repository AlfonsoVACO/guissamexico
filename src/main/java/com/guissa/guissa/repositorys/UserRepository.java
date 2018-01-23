package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guissa.guissa.models.entidades.User;

public interface UserRepository  extends JpaRepository<User, Serializable>{

}
