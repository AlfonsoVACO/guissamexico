package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.entidades.Negocios;
import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.ContactNegociosService;
import com.guissa.guissa.services.NegociosService;
import com.guissa.guissa.utils.ExamplesClass;

@Controller
@RequestMapping("/admins/negocios")
public class AdminNegociosController {

	@Autowired
	@Qualifier("servicioNegocios")
	private NegociosService servicioNegocios;
	
	@Autowired
	@Qualifier("servicioContactNegocios")
	private ContactNegociosService servicioContactNegocios;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("negocios", servicioNegocios.listAllNegocios() );
		return LstAdminViews.ADMIN_NEGOCIOS_INDEX_VIEW;		
	}
	
	@GetMapping("/caducados/")
	public String caducados(Model model) {
		return LstAdminViews.ADMIN_CADUCADOS_INDEX_VIEW;		
	}
	
	@GetMapping("/caducados/search/{example}")
	public String caducadosSearch(@PathVariable(name = "example") String nombre , Model model) {
		ExamplesClass<Negocios> examplesNegocios = 
				new ExamplesClass<>(new Negocios(), new Object[] { "nombre", nombre });
		model.addAttribute("caducados", servicioNegocios.getNegociosByCriteria(examplesNegocios.getExample()) );
		return LstAdminViews.ADMIN_CADUCADOS_LISTA_VIEW;
	}
	
	@GetMapping("/contacto_neg/")
	public String contactoNeg(Model model) {
		model.addAttribute("contactonegs", servicioContactNegocios.listAllContactNegocios());
		return LstAdminViews.ADMIN_CONTACTO_NEG_INDEX_VIEW;		
	}
}
