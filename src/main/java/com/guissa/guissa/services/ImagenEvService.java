package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Imagenev;

public interface ImagenEvService {
	public abstract List<Imagenev> listAllImagenev();
	public abstract long imagenevCount();
	public abstract Optional<Imagenev> getImagenevById(Integer id);
	public abstract Imagenev saveImagenev(Imagenev imagenev);
	public abstract void deleteImagenev(Integer id);
}
