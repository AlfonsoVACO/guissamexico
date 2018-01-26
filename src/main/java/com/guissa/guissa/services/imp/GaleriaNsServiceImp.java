package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.GaleriaNs;
import com.guissa.guissa.repositorys.GaleriaNRepository;
import com.guissa.guissa.services.GaleriaNsService;

@Service("servicioGaleriaNs")
public class GaleriaNsServiceImp implements GaleriaNsService {

	@Autowired
	@Qualifier("galeriaNRepository")
	private GaleriaNRepository galeriaNRepository;

	@Override
	public List<GaleriaNs> listAllGaleriaNs() {
		return galeriaNRepository.findAll();
	}

	@Override
	public long galeriaNsCount() {
		return galeriaNRepository.count();
	}

	@Override
	public Optional<GaleriaNs> getGaleriaNsById(Integer id) {
		return galeriaNRepository.findById(id);
	}

	@Override
	public GaleriaNs saveGaleriaNs(GaleriaNs galeriaNs) {
		return galeriaNRepository.save(galeriaNs);
	}

	@Override
	public void deleteGaleriaNs(Integer id) {
		galeriaNRepository.deleteById(id);
		
	}
}
