package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Patrocinador;
import com.guissa.guissa.repositorys.PatrocinadorRepository;
import com.guissa.guissa.services.PatrocinadorService;

@Service("servicioPatrocinador")
public class PatrocinadorServiceImp implements PatrocinadorService{

	@Autowired
	@Qualifier("patrocinadorRepository")
	private PatrocinadorRepository patrocinadorRepository;

	@Override
	public List<Patrocinador> listAllPatrocinador() {
		return patrocinadorRepository.findAll();
	}

	@Override
	public long patrocinadorCount() {
		return patrocinadorRepository.count();
	}

	@Override
	public Optional<Patrocinador> getPatrocinadorById(Integer id) {
		return patrocinadorRepository.findById(id);
	}

	@Override
	public Patrocinador savePatrocinador(Patrocinador patrocinador) {
		return patrocinadorRepository.save(patrocinador);
	}

	@Override
	public void deletePatrocinador(Integer id) {
		patrocinadorRepository.deleteById(id);
		
	}
}
