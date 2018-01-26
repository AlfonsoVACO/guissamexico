package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Estados;

public interface EstadosService {
	public abstract List<Estados> listAllEstados();
	public abstract long estadosCount();
	public abstract Optional<Estados> getEstadosById(Integer id);
	public abstract Estados saveEstados(Estados estados);
	public abstract void deleteEstados(Integer id);
}
