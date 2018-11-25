package com.guissa.guissa.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.guissa.guissa.models.entidades.TipoUsuario;
import com.guissa.guissa.services.TipoUsuarioService;

@Controller
@RequestMapping("/administrador/tiposdeusuario")
public class TiposUsuController {
	
	private static final Log LOGGER = LogFactory.getLog(InicioController.class);
	
	/*@Autowired
	@Qualifier("exComonent")
	private ExComonent excomponent;*/
	
	/*@GetMapping("/")
	public String list() {
		return "redirect:/tiposusu";
	}*/
	
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("/tiposusu");
	}
	
	@Autowired
	//@Qualifier("servicioTipousuario")
	private TipoUsuarioService tipousuario;

	@GetMapping("/tiposusu")
	public String list(Model model) {
		LOGGER.info("INFO");
		LOGGER.warn("Warning");
		LOGGER.error("Error");
		LOGGER.debug("Debug");
		model.addAttribute("lista", tipousuario.listAllTipoUsuario());
		return "views/tipos";
	}
	
	@PostMapping("/addtiposusu")
	public ModelAndView addTipos(@ModelAttribute("tipousuario") TipoUsuario tipou) {
		ModelAndView mav = new ModelAndView("views/restipos");
		tipousuario.saveTipoUsuario(tipou);
		mav.addObject("tipousuario", tipousuario);				
		return mav;
	}
	//public ModelAndView addTipos(@Valid @ModelAttribute("tipousuario") TipoUsuario tipousuario, BindingResult bindingresult) {
	//	if(bindingresult.hasErrors()){
	//		{editar formulario}
			/*
			 * th:if="${#fields.hasErrors('name')}" th:errors=${name}
			 * */
	//	}
	//}
}
