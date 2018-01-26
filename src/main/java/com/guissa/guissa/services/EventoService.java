package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Evento;

public interface EventoService {
	public abstract List<Evento> listAllEvento();
	public abstract long eventoCount();
	public abstract Optional<Evento> getEventoById(Integer id);
	public abstract Evento saveEvento(Evento evento);
	public abstract void deleteEvento(Integer id);
}
