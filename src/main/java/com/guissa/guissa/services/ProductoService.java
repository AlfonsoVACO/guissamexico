package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Producto;

public interface ProductoService {
	public abstract List<Producto> listAllProducto();
	public abstract long productoCount();
	public abstract Optional<Producto> getProductoById(Integer id);
	public abstract Producto saveProducto(Producto producto);
	public abstract void deleteProducto(Integer id);
}
