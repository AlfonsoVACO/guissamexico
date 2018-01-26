package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Reservacion;
import com.guissa.guissa.repositorys.ReservacionRepository;
import com.guissa.guissa.services.ReservacionService;

@Service("servicioRecervacion")
public class ReservacionServiceImp implements ReservacionService{
	@Autowired
	@Qualifier("reservacionRepository")
	private ReservacionRepository reservacionRepository;

	@Override
	public List<Reservacion> listAllReservacion() {
		return reservacionRepository.findAll();
	}

	@Override
	public long reservacionCount() {
		return reservacionRepository.count();
	}

	@Override
	public Optional<Reservacion> getReservacionById(Integer id) {
		return reservacionRepository.findById(id);
	}

	@Override
	public Reservacion saveReservacion(Reservacion reservacion) {
		return reservacionRepository.save(reservacion);
	}

	@Override
	public void deleteReservacion(Integer id) {
		reservacionRepository.deleteById(id);
		
	}
}
