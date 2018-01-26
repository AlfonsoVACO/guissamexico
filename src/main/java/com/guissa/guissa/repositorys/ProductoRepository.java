package com.guissa.guissa.repositorys;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guissa.guissa.models.entidades.Producto;

@Repository("productoRepository")
public interface ProductoRepository  extends JpaRepository<Producto, Serializable>{

}
