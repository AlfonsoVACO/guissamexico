package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.EventoService;

@Controller
@RequestMapping("/admins/eventos")
public class AdminEventosController {
	
	@Autowired
	@Qualifier("servicioEvento")
	private EventoService servicioEvento;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("eventos", servicioEvento.listAllEvento() );
		return LstAdminViews.ADMIN_EVENTOS_INDEX_VIEW;		
	}
	
}
