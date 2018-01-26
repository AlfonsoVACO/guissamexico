package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Precios;

public interface PreciosService {
	public abstract List<Precios> listAllPrecios();
	public abstract long preciosCount();
	public abstract Optional<Precios> getPreciosById(Integer id);
	public abstract Precios savePrecios(Precios precios);
	public abstract void deletePrecios(Integer id);
}
