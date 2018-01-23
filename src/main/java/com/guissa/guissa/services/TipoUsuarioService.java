package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.TipoUsuario;


public interface TipoUsuarioService {
	public abstract List<TipoUsuario> listAllTipoUsuario();
	public abstract Optional<TipoUsuario> getTipoUsuarioById(Integer id);
	public abstract TipoUsuario saveTipoUsuario(TipoUsuario tipousuario);
	public abstract void deleteTipoUsuario(Integer id);
}
