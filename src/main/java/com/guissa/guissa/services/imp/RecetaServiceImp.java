package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Receta;
import com.guissa.guissa.repositorys.RecetaRepository;
import com.guissa.guissa.services.RecetaService;

@Service("servicioReceta")
public class RecetaServiceImp implements RecetaService{

	@Autowired
	@Qualifier("recetaRepository")
	private RecetaRepository recetaRepository;

	@Override
	public List<Receta> listAllReceta() {
		return recetaRepository.findAll();
	}

	@Override
	public long recetaCount() {
		return recetaRepository.count();
	}

	@Override
	public Optional<Receta> getRecetaById(Integer id) {
		return recetaRepository.findById(id);
	}

	@Override
	public Receta saveReceta(Receta receta) {
		return recetaRepository.save(receta);
	}

	@Override
	public void deleteReceta(Integer id) {
		recetaRepository.deleteById(id);
		
	}
}
