package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Patrocinador;

public interface PatrocinadorService {
	public abstract List<Patrocinador> listAllPatrocinador();
	public abstract long patrocinadorCount();
	public abstract Optional<Patrocinador> getPatrocinadorById(Integer id);
	public abstract Patrocinador savePatrocinador(Patrocinador patrocinador);
	public abstract void deletePatrocinador(Integer id);
}
