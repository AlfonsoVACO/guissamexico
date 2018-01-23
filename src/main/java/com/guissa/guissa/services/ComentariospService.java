package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Comentariosp;

public interface ComentariospService {
	public abstract List<Comentariosp> listAllComentariosp();
	public abstract long comentariospCount();
	public abstract Optional<Comentariosp> getComentariospById(Integer id);
	public abstract Comentariosp saveComentariosp(Comentariosp tipousuario);
	public abstract void deleteComentariosp(Integer id);
}
