package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Comentariosp;
import com.guissa.guissa.repositorys.ComentariosPRepository;
import com.guissa.guissa.services.ComentariospService;

@Service("servicioComentariosp")
public class ComentariospServiceImp implements ComentariospService{
	
	@Autowired
	@Qualifier("comentariopRepository")
	private ComentariosPRepository comentariospRepository;

	@Override
	public List<Comentariosp> listAllComentariosp() {
		return comentariospRepository.findAll();
	}

	@Override
	public long comentariospCount() {
		return comentariospRepository.count();
	}

	@Override
	public Optional<Comentariosp> getComentariospById(Integer id) {
		return comentariospRepository.findById(id);
	}

	@Override
	public Comentariosp saveComentariosp(Comentariosp comentariosp) {
		return comentariospRepository.save(comentariosp);
	}

	@Override
	public void deleteComentariosp(Integer id) {
		comentariospRepository.deleteById(id);
		
	}

}
