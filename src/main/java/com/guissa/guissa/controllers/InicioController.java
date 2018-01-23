package com.guissa.guissa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.guissa.guissa.models.entidades.*;
import com.guissa.guissa.models.resources.*;

@Controller
//@RequestMapping("/inicio")
public class InicioController {
	
	private static final Log LOGGER = LogFactory.getLog(InicioController.class);

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("listado", listabanner());
		model.addAttribute("nombre", "Al");
		return LstViews.INDEX_VIEW.getString();
	}

	@GetMapping("/indexmodel")
	public ModelAndView indexmodel() {
		ModelAndView mav = new ModelAndView(LstViews.INDEX_VIEW.getString());
		mav.addObject("nombre", "Al");
		return mav;
		// return new ModelAndView(LstViews.INDEX_VIEW.getString());
	}

	private List<Banner> listabanner() {
		List<Banner> lista = new ArrayList<Banner>();
		byte[] biteslist = null;
		lista.add(new Banner(1, "asd", "pug", biteslist));
		lista.add(new Banner(2, "ewrew", "32", biteslist));
		lista.add(new Banner(3, "543", "dfsgr", biteslist));
		lista.add(new Banner(4, "vdfv", "adsdas", biteslist));
		return lista;
	}

	// get {
	// request con parametros ?id=
	@GetMapping("/parametros")
	public ModelAndView parametros(@RequestParam(name = "id", required = false, defaultValue = "x") String nombre) {
		ModelAndView mav = new ModelAndView(LstViews.INDEX_VIEW.getString());
		mav.addObject("nombre", nombre);
		return mav;
	}

	// request con parametros /1
	@GetMapping("/parametros/{id}")
	public ModelAndView parametrosdiag(@PathVariable(name = "id") String nombre) {
		ModelAndView mav = new ModelAndView(LstViews.INDEX_VIEW.getString());
		mav.addObject("nombre", nombre);
		return mav;
	}
	// }
	
	// post{
	@GetMapping("/vistaform")
	public String showForm(Model model) {
		model.addAttribute("listado", listabanner());
		return LstViews.INDEX_VIEW.getString();
		
	}
	
	
	@GetMapping("/addContact")
	public ModelAndView addForm(@ModelAttribute("banner") Banner banner) {
		ModelAndView mav = new ModelAndView(LstViews.INDEX_VIEW.getString());
		mav.addObject("nombre", banner);
		return mav;
		
	}
	//}

}
