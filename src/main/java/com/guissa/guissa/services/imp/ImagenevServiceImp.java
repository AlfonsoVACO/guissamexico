package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Imagenev;
import com.guissa.guissa.repositorys.ImagenEvRepository;
import com.guissa.guissa.services.ImagenEvService;

@Service("servicioImagenev")
public class ImagenevServiceImp implements ImagenEvService {

	@Autowired
	@Qualifier("imagenevRepository")
	private ImagenEvRepository imagenevRepository;

	@Override
	public List<Imagenev> listAllImagenev() {
		return imagenevRepository.findAll();
	}

	@Override
	public long imagenevCount() {
		return imagenevRepository.count();
	}

	@Override
	public Optional<Imagenev> getImagenevById(Integer id) {
		return imagenevRepository.findById(id);
	}

	@Override
	public Imagenev saveImagenev(Imagenev imagenev) {
		return imagenevRepository.save(imagenev);
	}

	@Override
	public void deleteImagenev(Integer id) {
		imagenevRepository.deleteById(id);
		
	}
}
