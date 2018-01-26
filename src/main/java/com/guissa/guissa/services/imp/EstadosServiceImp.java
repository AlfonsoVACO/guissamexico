package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Estados;
import com.guissa.guissa.repositorys.EstadosRepository;
import com.guissa.guissa.services.EstadosService;

@Service("servicioEstados")
public class EstadosServiceImp implements EstadosService {
	
	@Autowired
	@Qualifier("estadosRepository")
	private EstadosRepository estadosRepository;

	@Override
	public List<Estados> listAllEstados() {
		return estadosRepository.findAll();
	}

	@Override
	public long estadosCount() {
		return estadosRepository.count();
	}

	@Override
	public Optional<Estados> getEstadosById(Integer id) {
		return estadosRepository.findById(id);
	}

	@Override
	public Estados saveEstados(Estados estados) {
		return estadosRepository.save(estados);
	}

	@Override
	public void deleteEstados(Integer id) {
		estadosRepository.deleteById(id);
		
	}
}
