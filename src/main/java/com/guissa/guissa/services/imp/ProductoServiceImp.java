package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Producto;
import com.guissa.guissa.repositorys.ProductoRepository;
import com.guissa.guissa.services.ProductoService;

@Service("servicioProducto")
public class ProductoServiceImp implements ProductoService{

	@Autowired
	@Qualifier("productoRepository")
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> listAllProducto() {
		return productoRepository.findAll();
	}

	@Override
	public long productoCount() {
		return productoRepository.count();
	}

	@Override
	public Optional<Producto> getProductoById(Integer id) {
		return productoRepository.findById(id);
	}

	@Override
	public Producto saveProducto(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public void deleteProducto(Integer id) {
		productoRepository.deleteById(id);
		
	}
}
