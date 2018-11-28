package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.PatrocinadorService;

@Controller
@RequestMapping("/admins/patrocinadores")
public class AdminPatrocinadoresController {
	
	@Autowired
	@Qualifier("servicioPatrocinador")
	private PatrocinadorService servicioPatrocinador;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("patrocinadores", servicioPatrocinador.listAllPatrocinador() );
		return LstAdminViews.ADMIN_PERFIL_INDEX_VIEW;		
	}
}
