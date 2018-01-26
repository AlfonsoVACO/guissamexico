package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Notas;
import com.guissa.guissa.repositorys.NotasRepository;
import com.guissa.guissa.services.NotasService;

@Service("servicioNotas")
public class NotasServiceImp implements NotasService{

	@Autowired
	@Qualifier("notasRepository")
	private NotasRepository notasRepository;

	@Override
	public List<Notas> listAllNotas() {
		return notasRepository.findAll();
	}

	@Override
	public long notasCount() {
		return notasRepository.count();
	}

	@Override
	public Optional<Notas> getNotasById(Integer id) {
		return notasRepository.findById(id);
	}

	@Override
	public Notas saveNotas(Notas notas) {
		return notasRepository.save(notas);
	}

	@Override
	public void deleteNotas(Integer id) {
		notasRepository.deleteById(id);
		
	}
}
