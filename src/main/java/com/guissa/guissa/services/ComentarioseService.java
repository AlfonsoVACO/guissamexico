package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Comentariose;

public interface ComentarioseService {
	public abstract List<Comentariose> listAllComentariose();
	public abstract long comentarioseCount();
	public abstract Optional<Comentariose> getComentarioseById(Integer id);
	public abstract Comentariose saveComentariose(Comentariose tipousuario);
	public abstract void deleteComentariose(Integer id);
}
