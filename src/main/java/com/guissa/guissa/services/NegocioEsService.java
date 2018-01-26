package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.NegocioEs;

public interface NegocioEsService {
	public abstract List<NegocioEs> listAllNegocioEs();
	public abstract long negocioEsCount();
	public abstract Optional<NegocioEs> getNegocioEsById(Integer id);
	public abstract NegocioEs saveNegocioEs(NegocioEs negocioEs);
	public abstract void deleteNegocioEs(Integer id);
}
