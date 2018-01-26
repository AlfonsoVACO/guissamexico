package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Imagenmenurestaurante;

public interface ImagenmenurestauranteService {
	public abstract List<Imagenmenurestaurante> listAllImagenmenurestaurante();
	public abstract long imagenmenurestauranteCount();
	public abstract Optional<Imagenmenurestaurante> getImagenmenurestauranteById(Integer id);
	public abstract Imagenmenurestaurante saveImagenmenurestaurante(Imagenmenurestaurante imagenmenurestaurante);
	public abstract void deleteImagenmenurestaurante(Integer id);
}
