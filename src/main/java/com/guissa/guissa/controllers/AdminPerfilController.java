package com.guissa.guissa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.utils.SesionVariables;

@Controller
@RequestMapping("/admins/perfil")
public class AdminPerfilController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("usuario", SesionVariables.sesionUsuario() );
		return LstAdminViews.ADMIN_PERFIL_INDEX_VIEW;		
	}
	
}
