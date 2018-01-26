package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Negocios;

public interface NegociosService {
	public abstract List<Negocios> listAllNegocios();
	public abstract long negociosCount();
	public abstract Optional<Negocios> getNegociosById(Integer id);
	public abstract Negocios saveNegocios(Negocios negocios);
	public abstract void deleteNegocios(Integer id);
}
