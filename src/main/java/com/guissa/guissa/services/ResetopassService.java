package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Resetopass;

public interface ResetopassService {
	public abstract List<Resetopass> listAllResetopass();
	public abstract long resetopassCount();
	public abstract Optional<Resetopass> getResetopassById(Integer id);
	public abstract Resetopass saveResetopass(Resetopass resetopass);
	public abstract void deleteResetopass(Integer id);
}
