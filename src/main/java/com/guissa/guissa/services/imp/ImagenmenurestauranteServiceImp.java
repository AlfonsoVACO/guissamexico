package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Imagenmenurestaurante;
import com.guissa.guissa.repositorys.ImagenmenurestauranteRepository;
import com.guissa.guissa.services.ImagenmenurestauranteService;

@Service("servicioImagenmenurestaurante")
public class ImagenmenurestauranteServiceImp implements ImagenmenurestauranteService {

	@Autowired
	@Qualifier("imagenmenurestauranteRepository")
	private ImagenmenurestauranteRepository imagenmenurestauranteRepository;

	@Override
	public List<Imagenmenurestaurante> listAllImagenmenurestaurante() {
		return imagenmenurestauranteRepository.findAll();
	}

	@Override
	public long imagenmenurestauranteCount() {
		return imagenmenurestauranteRepository.count();
	}

	@Override
	public Optional<Imagenmenurestaurante> getImagenmenurestauranteById(Integer id) {
		return imagenmenurestauranteRepository.findById(id);
	}

	@Override
	public Imagenmenurestaurante saveImagenmenurestaurante(Imagenmenurestaurante imagenmenurestaurante) {
		return imagenmenurestauranteRepository.save(imagenmenurestaurante);
	}

	@Override
	public void deleteImagenmenurestaurante(Integer id) {
		imagenmenurestauranteRepository.deleteById(id);
		
	}
}
