package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Galeria;
import com.guissa.guissa.services.GaleriaService;
import com.guissa.guissa.repositorys.GeleriaRepository;

@Service("servicioGaleria")
public class GaleriaServiceImp implements GaleriaService {
	
	@Autowired
	@Qualifier("galeriaRepository")
	private GeleriaRepository galeriaRepository;

	@Override
	public List<Galeria> listAllGaleria() {
		return galeriaRepository.findAll();
	}

	@Override
	public long galeriaCount() {
		return galeriaRepository.count();
	}

	@Override
	public Optional<Galeria> getGaleriaById(Integer id) {
		return galeriaRepository.findById(id);
	}

	@Override
	public Galeria saveGaleria(Galeria galeria) {
		return galeriaRepository.save(galeria);
	}

	@Override
	public void deleteGaleria(Integer id) {
		galeriaRepository.deleteById(id);
		
	}
}
