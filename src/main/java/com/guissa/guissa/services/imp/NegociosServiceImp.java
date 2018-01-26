package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Negocios;
import com.guissa.guissa.repositorys.NegociosRepository;
import com.guissa.guissa.services.NegociosService;

@Service("servicioNegocios")
public class NegociosServiceImp implements NegociosService{

	@Autowired
	@Qualifier("negociosRepository")
	private NegociosRepository negociosRepository;

	@Override
	public List<Negocios> listAllNegocios() {
		return negociosRepository.findAll();
	}

	@Override
	public long negociosCount() {
		return negociosRepository.count();
	}

	@Override
	public Optional<Negocios> getNegociosById(Integer id) {
		return negociosRepository.findById(id);
	}

	@Override
	public Negocios saveNegocios(Negocios negocios) {
		return negociosRepository.save(negocios);
	}

	@Override
	public void deleteNegocios(Integer id) {
		negociosRepository.deleteById(id);
		
	}
}
