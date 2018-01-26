package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.NegocioEs;
import com.guissa.guissa.repositorys.NegocioEsRepository;
import com.guissa.guissa.services.NegocioEsService;

@Service("servicioNegocioEs")
public class NegocioEsServiceImp implements NegocioEsService{

	@Autowired
	@Qualifier("negociosesRepository")
	private NegocioEsRepository negociosesRepository;

	@Override
	public List<NegocioEs> listAllNegocioEs() {
		return negociosesRepository.findAll();
	}

	@Override
	public long negocioEsCount() {
		return negociosesRepository.count();
	}

	@Override
	public Optional<NegocioEs> getNegocioEsById(Integer id) {
		return negociosesRepository.findById(id);
	}

	@Override
	public NegocioEs saveNegocioEs(NegocioEs negocioEs) {
		return negociosesRepository.save(negocioEs);
	}

	@Override
	public void deleteNegocioEs(Integer id) {
		negociosesRepository.deleteById(id);
		
	}
}
