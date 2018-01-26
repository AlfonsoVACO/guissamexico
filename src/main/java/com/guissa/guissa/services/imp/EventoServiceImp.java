package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Evento;
import com.guissa.guissa.repositorys.EventoRepository;
import com.guissa.guissa.services.EventoService;

@Service("servicioEvento")
public class EventoServiceImp implements EventoService {

	@Autowired
	@Qualifier("eventoRepository")
	private EventoRepository eventoRepository;

	@Override
	public List<Evento> listAllEvento() {
		return eventoRepository.findAll();
	}

	@Override
	public long eventoCount() {
		return eventoRepository.count();
	}

	@Override
	public Optional<Evento> getEventoById(Integer id) {
		return eventoRepository.findById(id);
	}

	@Override
	public Evento saveEvento(Evento evento) {
		return eventoRepository.save(evento);
	}

	@Override
	public void deleteEvento(Integer id) {
		eventoRepository.deleteById(id);
		
	}
}
