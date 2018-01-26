package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Resetopass;
import com.guissa.guissa.repositorys.ResetoPassRepository;
import com.guissa.guissa.services.ResetopassService;

@Service("servicioResetopass")
public class ResetopassServiceImp implements ResetopassService{

	@Autowired
	@Qualifier("resetopassRepository")
	private ResetoPassRepository resetopassRepository;

	@Override
	public List<Resetopass> listAllResetopass() {
		return resetopassRepository.findAll();
	}

	@Override
	public long resetopassCount() {
		return resetopassRepository.count();
	}

	@Override
	public Optional<Resetopass> getResetopassById(Integer id) {
		return resetopassRepository.findById(id);
	}

	@Override
	public Resetopass saveResetopass(Resetopass resetopass) {
		return resetopassRepository.save(resetopass);
	}

	@Override
	public void deleteResetopass(Integer id) {
		resetopassRepository.deleteById(id);
		
	}
}
