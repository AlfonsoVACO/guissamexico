package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Reservags;

public interface ReservagsService {
	public abstract List<Reservags> listAllReservags();
	public abstract long reservagsCount();
	public abstract Optional<Reservags> getReservagsById(Integer id);
	public abstract Reservags saveReservags(Reservags reservags);
	public abstract void deleteReservags(Integer id);
}
