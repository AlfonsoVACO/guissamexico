package com.guissa.guissa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.guissa.guissa.models.entidades.Producto;
import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.EstadosService;
import com.guissa.guissa.services.MunicipiosService;
import com.guissa.guissa.services.ProductoService;
import com.guissa.guissa.services.TemporadasService;
import com.guissa.guissa.services.TipoService;


@Controller
@RequestMapping("/admins/productos")
public class AdminProductosController {
	
	@Autowired
	@Qualifier("servicioProducto")
	private ProductoService servicioProducto;
	
	@Autowired
	@Qualifier("servicioTipo")
	private TipoService servicioTipo;
	
	@Autowired
	@Qualifier("servicioEstados")
	private EstadosService servicioEstados;
	
	@Autowired
	@Qualifier("servicioMunicipios")
	private MunicipiosService servicioMunicipios;
	
	@Autowired
	@Qualifier("servicioTemporadas")
	private TemporadasService servicioTemporadas;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("productos", servicioProducto.listAllProducto());
		return LstAdminViews.ADMIN_PRODUCTOS_INDEX_VIEW;		
	}
	
	@GetMapping("/add")
	public String add(
			@RequestParam(defaultValue = "idaccion") int idaccion,
			@RequestParam(defaultValue = "idcrud") int idcrud, Model model) {
		model.addAttribute("producto", new Producto());
		model.addAttribute("tipos", servicioTipo.listAllTipo());
		model.addAttribute("temporadas", servicioTemporadas.listAllTemporadas());
		model.addAttribute("estados", servicioEstados.listAllEstados());
		model.addAttribute("municipios", servicioMunicipios.listAllMunicipios());
		
		model.addAttribute("accion", "Agregar");
		model.addAttribute("actioncd", "0");
		return LstAdminViews.ADMIN_PRODUCTOS_CRUD_VIEW;		
	}
	
	@GetMapping("/img")
	public String img(
			@RequestParam(defaultValue = "idaccion") int idaccion,
			@RequestParam(defaultValue = "idcrud") int idcrud, Model model) {
		Optional<Producto> opcional = servicioProducto.getProductoById(idcrud);
		Producto producto = opcional.isPresent() ? opcional.get() : new Producto();
		model.addAttribute("producto", producto);
		model.addAttribute("tipos", servicioTipo.listAllTipo());
		model.addAttribute("temporadas", servicioTemporadas.listAllTemporadas());
		model.addAttribute("estados", servicioEstados.listAllEstados());
		model.addAttribute("municipios", servicioMunicipios.listAllMunicipios());
		return LstAdminViews.ADMIN_PRODUCTOS_CRUD_VIEW;		
	}
	
	@GetMapping("/rec")
	public String rec(
			@RequestParam(defaultValue = "idaccion") int idaccion,
			@RequestParam(defaultValue = "idcrud") int idcrud, Model model) {
		Optional<Producto> opcional = servicioProducto.getProductoById(idcrud);
		Producto producto = opcional.isPresent() ? opcional.get() : new Producto();
		model.addAttribute("producto", producto);
		model.addAttribute("tipos", servicioTipo.listAllTipo());
		model.addAttribute("temporadas", servicioTemporadas.listAllTemporadas());
		model.addAttribute("estados", servicioEstados.listAllEstados());
		model.addAttribute("municipios", servicioMunicipios.listAllMunicipios());
		return LstAdminViews.ADMIN_PRODUCTOS_CRUD_VIEW;		
	}
	
	@GetMapping("/edit")
	public String edit(
			@RequestParam(defaultValue = "idaccion") int idaccion,
			@RequestParam(defaultValue = "idcrud") int idcrud, Model model) {
		Optional<Producto> opcional = servicioProducto.getProductoById(idcrud);
		Producto producto = opcional.isPresent() ? opcional.get() : new Producto();
		model.addAttribute("producto", producto);
		model.addAttribute("tipos", servicioTipo.listAllTipo());
		model.addAttribute("temporadas", servicioTemporadas.listAllTemporadas());
		model.addAttribute("estados", servicioEstados.listAllEstados());
		model.addAttribute("municipios", servicioMunicipios.listAllMunicipios());
		
		model.addAttribute("accion", "Editar");
		model.addAttribute("actioncd", "1");
		return LstAdminViews.ADMIN_PRODUCTOS_CRUD_VIEW;		
	}
	
	@GetMapping("/delete")
	public String delete(
			@RequestParam(defaultValue = "idaccion") int idaccion,
			@RequestParam(defaultValue = "idcrud") int idcrud, Model model) {
		Optional<Producto> opcional = servicioProducto.getProductoById(idcrud);
		Producto producto = opcional.isPresent() ? opcional.get() : new Producto();
		model.addAttribute("producto", producto);
		model.addAttribute("tipos", servicioTipo.listAllTipo());
		model.addAttribute("temporadas", servicioTemporadas.listAllTemporadas());
		model.addAttribute("estados", servicioEstados.listAllEstados());
		model.addAttribute("municipios", servicioMunicipios.listAllMunicipios());
		
		model.addAttribute("accion", "Eliminar");
		model.addAttribute("actioncd", "2");
		
		return LstAdminViews.ADMIN_PRODUCTOS_CRUD_VIEW;		
	}
}
