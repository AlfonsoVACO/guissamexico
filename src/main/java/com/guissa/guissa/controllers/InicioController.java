
package com.guissa.guissa.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.guissa.guissa.models.MBanner;
import com.guissa.guissa.models.entidades.*;
import com.guissa.guissa.models.resources.*;
import com.guissa.guissa.services.BannerService;
import com.guissa.guissa.services.ContactoService;

@Controller
@PreAuthorize("permitAll()")
public class InicioController {
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		return "views/logina";
	}
	
	@Autowired
	@Qualifier("servicioBanner")
	private BannerService servicioBanner;
	
	@Autowired
	@Qualifier("servicioContacto")
	private ContactoService servicioContacto;
	
	private static final Log LOGGER = LogFactory.getLog(InicioController.class);

	@GetMapping("/")
	public String index(Model model) {
		List<MBanner> lista_mbanner = new ArrayList<MBanner>();
		List<Banner> lista_banner = servicioBanner.listAllBanner();
		for(Banner item: lista_banner) {
			MBanner modelo_banner = new MBanner();
			modelo_banner.setIdBanner(item.getIdBanner());
			modelo_banner.setNombre(item.getNombre());
			modelo_banner.setSubTitle(item.getSubTitle());
			
			byte[] photo = item.getImagen();
            String bphoto = Base64.getEncoder().encodeToString(photo);
			modelo_banner.setImagen(bphoto);
			
			lista_mbanner.add(modelo_banner);
		}
		model.addAttribute("listado", lista_mbanner);
		return LstViews.INDEX_VIEW.getString();
	}
	
	@RequestMapping(value = "/image/{image_id}", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getImage(@PathVariable("image_id") Integer imageId) throws IOException {
    	
    	Banner banner = servicioBanner.getBannerById(imageId).get();
    	System.out.println(banner.toString());
        byte[] imageContent = banner.getImagen();//get image from DAO based on id
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);
        return new ResponseEntity<byte[]>(imageContent, headers, HttpStatus.OK);
    }
	
	@GetMapping("/menuss")
	public String menuss(Model model) {
		return LstViews.MENUSS_VIEWS.getString();
	}
	
	@GetMapping("/categorias/{id}")
	public ModelAndView categorias(@PathVariable(name = "id") String nombre) {
		ModelAndView mav = new ModelAndView(LstViews.CATEGORIAS_VIEW.getString());
		mav.addObject("nombre", nombre);
		return mav;
	}
	
	@GetMapping("/ubicacion")
	public String ubicacion(Model model) {
		model.addAttribute("listado", listabanner());
		model.addAttribute("nombre", "Al");
		return LstViews.UBICACION_VIEW.getString();
	}
	
	@GetMapping("/negocios/{id}")
	public ModelAndView negocios(@PathVariable(name = "id") String nombre) {
		ModelAndView mav = new ModelAndView(LstViews.NEGOCIOS_VIEW.getString());
		mav.addObject("nombre", nombre);
		return mav;
	}
	
	@GetMapping("/productos/{id}")
	public ModelAndView productos(@PathVariable(name = "id") String nombre) {
		ModelAndView mav = new ModelAndView(LstViews.NOTICIAS_VIEW.getString());
		mav.addObject("nombre", nombre);
		return mav;
	}
	
	@GetMapping("/eventos/{id}")
	public ModelAndView eventos(@PathVariable(name = "id") String nombre) {
		ModelAndView mav = new ModelAndView(LstViews.EVENTOS_VIEW.getString());
		mav.addObject("nombre", nombre);
		return mav;
	}
	
	@GetMapping("/eventos")
	public String eventosShowList() {
		return LstViews.EVENTOS_VIEW.getString();
	}

	@GetMapping("/precios")
	public String precios(Model model) {
		model.addAttribute("listado", listabanner());
		model.addAttribute("nombre", "Al");
		return LstViews.PRECIOS_VIEW.getString();
	}
	
	@GetMapping("/contacto")
	public ModelAndView contacto() {
		ModelAndView mav = new ModelAndView(LstViews.CONTACTO_VIEW.getString());
		//mav.addObject("listado", listabanner());
		mav.addObject("contacto", new Contacto());
		return mav;
	}

	@GetMapping("/registro")
	public String registro(Model model) {
		model.addAttribute("listado", listabanner());
		model.addAttribute("nombre", "Al");
		return LstViews.REGISTRO_VIEW.getString();
	}

	@GetMapping("/historias")
	public String historias(Model model) {
		model.addAttribute("listado", listabanner());
		model.addAttribute("nombre", "Al");
		return LstViews.HISTORIAS_VIEW.getString();
	}

	@GetMapping("/solicitud/{id}")
	public ModelAndView solicitud(@PathVariable(name = "id") String nombre) {
		ModelAndView mav = new ModelAndView(LstViews.SOLICITUD_VIEW.getString());
		mav.addObject("nombre", nombre);
		return mav;
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
	
	
	@PostMapping("/addcontacto")
	public String addContact(@ModelAttribute("contacto") Contacto contacto) {
		LOGGER.info("Guardando contacto");
		servicioContacto.saveContacto(contacto);
		return "redirect: /contacto";		
	}
	//}
	
	//Eliminar
	@GetMapping("/deletecontacto")
	public ModelAndView removecontacto(@RequestParam(name = "id", required=false) int id) {
		servicioContacto.deleteContacto(id);
		return contacto();
	}
	
	//@{/deletecontacto?id=__${contact.id}__}

}
