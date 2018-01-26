package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Temporadas;

public interface TemporadasService {
	public abstract List<Temporadas> listAllTemporadas();
	public abstract long temporadasCount();
	public abstract Optional<Temporadas> getTemporadasById(Integer id);
	public abstract Temporadas saveTemporadas(Temporadas temporadas);
	public abstract void deleteTemporadas(Integer id);
}
