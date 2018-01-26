package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Reservags;
import com.guissa.guissa.repositorys.ReservaGsRepository;
import com.guissa.guissa.services.ReservagsService;

@Service("servicioReservags")
public class ReservagsServiceImp implements ReservagsService{
	@Autowired
	@Qualifier("recervagsRepository")
	private ReservaGsRepository recervagsRepository;

	@Override
	public List<Reservags> listAllReservags() {
		return recervagsRepository.findAll();
	}

	@Override
	public long reservagsCount() {
		return recervagsRepository.count();
	}

	@Override
	public Optional<Reservags> getReservagsById(Integer id) {
		return recervagsRepository.findById(id);
	}

	@Override
	public Reservags saveReservags(Reservags reservags) {
		return recervagsRepository.save(reservags);
	}

	@Override
	public void deleteReservags(Integer id) {
		recervagsRepository.deleteById(id);
		
	}
}
