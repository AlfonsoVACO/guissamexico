package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Comentariosn;

public interface ComentariosnService {
	public abstract List<Comentariosn> listAllComentariose();
	public abstract long comentariosnCount();
	public abstract Optional<Comentariosn> getComentariosnById(Integer id);
	public abstract Comentariosn saveComentariosn(Comentariosn tipousuario);
	public abstract void deleteComentariosn(Integer id);

}
