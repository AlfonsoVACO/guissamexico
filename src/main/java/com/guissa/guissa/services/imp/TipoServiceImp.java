package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Tipo;
import com.guissa.guissa.repositorys.TipoRepository;
import com.guissa.guissa.services.TipoService;

@Service("servicioTipo")
public class TipoServiceImp implements TipoService{
	@Autowired
	@Qualifier("tipoRepository")
	private TipoRepository tipoRepository;

	@Override
	public List<Tipo> listAllTipo() {
		return tipoRepository.findAll();
	}

	@Override
	public long tipoCount() {
		return tipoRepository.count();
	}

	@Override
	public Optional<Tipo> getTipoById(Integer id) {
		return tipoRepository.findById(id);
	}

	@Override
	public Tipo saveTipo(Tipo tipo) {
		return tipoRepository.save(tipo);
	}

	@Override
	public void deleteTipo(Integer id) {
		tipoRepository.deleteById(id);
		
	}

}
