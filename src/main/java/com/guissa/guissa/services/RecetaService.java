package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Receta;

public interface RecetaService {
	public abstract List<Receta> listAllReceta();
	public abstract long recetaCount();
	public abstract Optional<Receta> getRecetaById(Integer id);
	public abstract Receta saveReceta(Receta receta);
	public abstract void deleteReceta(Integer id);
}
