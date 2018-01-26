package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Menurestaurante;

public interface MenuRestauranteService {
	public abstract List<Menurestaurante> listAllMenurestaurante();
	public abstract long menurestauranteCount();
	public abstract Optional<Menurestaurante> getMenurestauranteById(Integer id);
	public abstract Menurestaurante saveMenurestaurante(Menurestaurante menurestaurante);
	public abstract void deleteMenurestaurante(Integer id);
}
