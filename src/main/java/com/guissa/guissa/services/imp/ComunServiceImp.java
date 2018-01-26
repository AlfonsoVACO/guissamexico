package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Comun;
import com.guissa.guissa.repositorys.ComunRepository;
import com.guissa.guissa.services.ComunService;

@Service("servicioComun")
public class ComunServiceImp implements ComunService {

	@Autowired
	@Qualifier("comunRepository")
	private ComunRepository comunRepository;

	@Override
	public List<Comun> listAllComun() {
		return comunRepository.findAll();
	}

	@Override
	public long comunCount() {
		return comunRepository.count();
	}

	@Override
	public Optional<Comun> getComunById(Integer id) {
		return comunRepository.findById(id);
	}

	@Override
	public Comun saveComun(Comun comun) {
		return comunRepository.save(comun);
	}

	@Override
	public void deleteComun(Integer id) {
		comunRepository.deleteById(id);
		
	}
}
