package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Tipo;

public interface TipoService {
	public abstract List<Tipo> listAllTipo();
	public abstract long tipoCount();
	public abstract Optional<Tipo> getTipoById(Integer id);
	public abstract Tipo saveTipo(Tipo tipo);
	public abstract void deleteTipo(Integer id);
}
