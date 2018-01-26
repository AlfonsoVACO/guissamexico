package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Municipios;
import com.guissa.guissa.repositorys.MunicipiosRepository;
import com.guissa.guissa.services.MunicipiosService;

@Service("servicioMunicipios")
public class MunicipiosServiceImp implements MunicipiosService{

	@Autowired
	@Qualifier("municipiosRepository")
	private MunicipiosRepository municipiosRepository;

	@Override
	public List<Municipios> listAllMunicipios() {
		return municipiosRepository.findAll();
	}

	@Override
	public long municipiosCount() {
		return municipiosRepository.count();
	}

	@Override
	public Optional<Municipios> getMunicipiosById(Integer id) {
		return municipiosRepository.findById(id);
	}

	@Override
	public Municipios saveMunicipios(Municipios municipios) {
		return municipiosRepository.save(municipios);
	}

	@Override
	public void deleteMunicipios(Integer id) {
		municipiosRepository.deleteById(id);
		
	}
}
