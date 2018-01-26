package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Imagennegocios;
import com.guissa.guissa.repositorys.ImagenNegociosRepository;
import com.guissa.guissa.services.ImagennegociosService;

@Service("servicioImagennegocios")
public class ImagennegociosServiceImp implements ImagennegociosService{

	@Autowired
	@Qualifier("imagennegociosRepository")
	private ImagenNegociosRepository imagennegociosRepository;

	@Override
	public List<Imagennegocios> listAllImagennegocios() {
		return imagennegociosRepository.findAll();
	}

	@Override
	public long imagennegociosCount() {
		return imagennegociosRepository.count();
	}

	@Override
	public Optional<Imagennegocios> getImagennegociosById(Integer id) {
		return imagennegociosRepository.findById(id);
	}

	@Override
	public Imagennegocios saveImagennegocios(Imagennegocios imagennegocios) {
		return imagennegociosRepository.save(imagennegocios);
	}

	@Override
	public void deleteImagennegocios(Integer id) {
		imagennegociosRepository.deleteById(id);
		
	}
}
