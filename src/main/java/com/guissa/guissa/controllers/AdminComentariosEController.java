package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.ComentarioseService;

@Controller
@RequestMapping("/admins/comentariose")
public class AdminComentariosEController {
	
	@Autowired
	@Qualifier("servicioComentariose")
	private ComentarioseService servicioComentariose;
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("comentariose", servicioComentariose.listAllComentariose() );
		return LstAdminViews.ADMIN_COMENTARIOS_EV_INDEX_VIEW;		
	}
}
