package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.ProductoService;


@Controller
@RequestMapping("/administracion/productos")
public class AdminProductosController {
	
	@Autowired
	@Qualifier("servicioProducto")
	private ProductoService servicioProducto;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("productos", servicioProducto.listAllProducto());
		return LstAdminViews.ADMIN_PRODUCTOS_INDEX_VIEW.getString();		
	}
}
