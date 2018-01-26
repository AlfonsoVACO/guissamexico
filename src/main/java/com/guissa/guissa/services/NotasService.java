package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Notas;

public interface NotasService {
	public abstract List<Notas> listAllNotas();
	public abstract long notasCount();
	public abstract Optional<Notas> getNotasById(Integer id);
	public abstract Notas saveNotas(Notas notas);
	public abstract void deleteNotas(Integer id);
}
