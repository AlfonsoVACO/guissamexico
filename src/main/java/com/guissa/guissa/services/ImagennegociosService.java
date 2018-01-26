package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Imagennegocios;

public interface ImagennegociosService {
	public abstract List<Imagennegocios> listAllImagennegocios();
	public abstract long imagennegociosCount();
	public abstract Optional<Imagennegocios> getImagennegociosById(Integer id);
	public abstract Imagennegocios saveImagennegocios(Imagennegocios imagennegocios);
	public abstract void deleteImagennegocios(Integer id);
}
