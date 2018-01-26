package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Precios;
import com.guissa.guissa.repositorys.PreciosRepository;
import com.guissa.guissa.services.PreciosService;

@Service("servicioPrecios")
public class PreciosServiceImp implements PreciosService{

	@Autowired
	@Qualifier("preciosRepository")
	private PreciosRepository preciosRepository;

	@Override
	public List<Precios> listAllPrecios() {
		return preciosRepository.findAll();
	}

	@Override
	public long preciosCount() {
		return preciosRepository.count();
	}

	@Override
	public Optional<Precios> getPreciosById(Integer id) {
		return preciosRepository.findById(id);
	}

	@Override
	public Precios savePrecios(Precios precios) {
		return preciosRepository.save(precios);
	}

	@Override
	public void deletePrecios(Integer id) {
		preciosRepository.deleteById(id);
		
	}
}
