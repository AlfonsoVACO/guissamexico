package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Galeria;

public interface GaleriaService {
	public abstract List<Galeria> listAllGaleria();
	public abstract long galeriaCount();
	public abstract Optional<Galeria> getGaleriaById(Integer id);
	public abstract Galeria saveGaleria(Galeria galeria);
	public abstract void deleteGaleria(Integer id);
}
