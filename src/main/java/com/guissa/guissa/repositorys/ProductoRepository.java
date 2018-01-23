package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guissa.guissa.models.entidades.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Serializable>{

}
