package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Municipios;

public interface MunicipiosService {
	public abstract List<Municipios> listAllMunicipios();
	public abstract long municipiosCount();
	public abstract Optional<Municipios> getMunicipiosById(Integer id);
	public abstract Municipios saveMunicipios(Municipios municipios);
	public abstract void deleteMunicipios(Integer id);
}
