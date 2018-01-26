package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Reservacion;

public interface ReservacionService {
	public abstract List<Reservacion> listAllReservacion();
	public abstract long reservacionCount();
	public abstract Optional<Reservacion> getReservacionById(Integer id);
	public abstract Reservacion saveReservacion(Reservacion reservacion);
	public abstract void deleteReservacion(Integer id);
}
