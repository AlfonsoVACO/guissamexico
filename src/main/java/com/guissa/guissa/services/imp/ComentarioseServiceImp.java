package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Comentariose;
import com.guissa.guissa.repositorys.ComentariosERepository;
import com.guissa.guissa.services.ComentarioseService;

@Service("servicioComentariose")
public class ComentarioseServiceImp implements ComentarioseService{
	
	@Autowired
	@Qualifier("comentarioeRepository")
	private ComentariosERepository comentarioseRepository;

	@Override
	public List<Comentariose> listAllComentariose() {
		return comentarioseRepository.findAll();
	}

	@Override
	public long comentarioseCount() {
		return comentarioseRepository.count();
	}

	@Override
	public Optional<Comentariose> getComentarioseById(Integer id) {
		return comentarioseRepository.findById(id);
	}

	@Override
	public Comentariose saveComentariose(Comentariose comentariose) {
		return comentarioseRepository.save(comentariose);
	}

	@Override
	public void deleteComentariose(Integer id) {
		// TODO Auto-generated method stub
		comentarioseRepository.deleteById(id);
	}


}
