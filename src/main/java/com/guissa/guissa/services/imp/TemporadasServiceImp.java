package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Temporadas;
import com.guissa.guissa.repositorys.TemporadasRepository;
import com.guissa.guissa.services.TemporadasService;

@Service("servicioTemporadas")
public class TemporadasServiceImp implements TemporadasService{
	
	@Autowired
	@Qualifier("temporadasRepository")
	private TemporadasRepository temporadasRepository;

	@Override
	public List<Temporadas> listAllTemporadas() {
		return temporadasRepository.findAll();
	}

	@Override
	public long temporadasCount() {
		return temporadasRepository.count();
	}

	@Override
	public Optional<Temporadas> getTemporadasById(Integer id) {
		return temporadasRepository.findById(id);
	}

	@Override
	public Temporadas saveTemporadas(Temporadas temporadas) {
		return temporadasRepository.save(temporadas);
	}

	@Override
	public void deleteTemporadas(Integer id) {
		temporadasRepository.deleteById(id);
		
	}
}
