package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Comentariosn;
import com.guissa.guissa.repositorys.ComentariosNRepository;
import com.guissa.guissa.services.ComentariosnService;

@Service("servicioComentariosn")
public class ComentariosnServiceImp implements ComentariosnService{
	
	@Autowired
	@Qualifier("comentarionRepository")
	private ComentariosNRepository comentariosnRepository;

	@Override
	public List<Comentariosn> listAllComentariose() {
		return comentariosnRepository.findAll();
	}

	@Override
	public long comentariosnCount() {
		return comentariosnRepository.count();
	}

	@Override
	public Optional<Comentariosn> getComentariosnById(Integer id) {
		return comentariosnRepository.findById(id);
	}

	@Override
	public Comentariosn saveComentariosn(Comentariosn comentariosn) {
		return comentariosnRepository.save(comentariosn);
	}

	@Override
	public void deleteComentariosn(Integer id) {
		comentariosnRepository.deleteById(id);
		
	}

}
