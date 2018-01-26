package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Comun;

public interface ComunService {
	public abstract List<Comun> listAllComun();
	public abstract long comunCount();
	public abstract Optional<Comun> getComunById(Integer id);
	public abstract Comun saveComun(Comun comun);
	public abstract void deleteComun(Integer id);

}
