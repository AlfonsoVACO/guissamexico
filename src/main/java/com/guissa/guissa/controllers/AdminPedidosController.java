package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.NegocioEsService;

@Controller
@RequestMapping("/admins/pedidos")
public class AdminPedidosController {
	
	@Autowired
	@Qualifier("servicioNegocioEs")
	private NegocioEsService servicioNegocioEs;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("pedidos", servicioNegocioEs.listAllNegocioEs() );
		return LstAdminViews.ADMIN_PEDIDOS_INDEX_VIEW;		
	}
	
}
