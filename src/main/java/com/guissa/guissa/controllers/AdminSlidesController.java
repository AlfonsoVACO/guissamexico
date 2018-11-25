package com.guissa.guissa.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.guissa.guissa.models.MBanner;
import com.guissa.guissa.models.entidades.Banner;
import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.BannerService;

@Controller
@RequestMapping("/administracion/slides")
public class AdminSlidesController {
	
	@Autowired
	@Qualifier("servicioBanner")
	private BannerService servicioBanner;	
	
	@GetMapping("/index")
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
		model.addAttribute("listar", lista_mbanner);
		return LstAdminViews.ADMIN_SLIDES_INDEX_VIEW.getString();
	}
	
	@GetMapping("/crud")
	public String crud(Model model, 
			@RequestParam(name = "idcrud", required = false, defaultValue = "0") int id,
			@RequestParam(name = "accion", required = false, defaultValue = "add") String accion) {		
		if(accion=="edit") {
			if(id != 0) {
				model.addAttribute("banner", servicioBanner.getBannerById(id));
				model.addAttribute("estilo", 1);
			}
		}else if(accion=="delete") {
			if(id != 0) {
				model.addAttribute("banner", servicioBanner.getBannerById(id));
				model.addAttribute("estilo", 2);
			}
		}
		return LstAdminViews.ADMIN_SLIDES_CRUD_VIEW.getString();
	}
	
	@PostMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) {
		servicioBanner.deleteBanner(id);
	}
	
	@PostMapping("/edit/{id}")
	public void edit(@PathVariable(name = "id") int id) {
		Optional<Banner> banner = servicioBanner.getBannerById(id);
		servicioBanner.saveBanner(banner.get());		
	}
	
	@RequestMapping(path = "/add", method = RequestMethod.POST, produces = MediaType.IMAGE_PNG_VALUE)
	public RedirectView add(@PathVariable(name = "banner") Banner banner_request,
			@RequestParam("file") MultipartFile file) throws IOException {
		
		banner_request.setImagen(file.getBytes());
		servicioBanner.saveBanner(banner_request);
		return new RedirectView("/index");
	}
}
