package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.TipoUsuario;
import com.guissa.guissa.repositorys.TipoUsuarioRepository;
import com.guissa.guissa.services.TipoUsuarioService;

@Service("servicioTipousuario")
public class TipoUsuarioServiceImp implements TipoUsuarioService{
	
	@Autowired
	//@Qualifier("servicioTipousuario")
	private TipoUsuarioRepository tipoUsuarioRepository;

	@Override
	public List<TipoUsuario> listAllTipoUsuario() {
		return tipoUsuarioRepository.findAll();
	}

	@Override
	public Optional<TipoUsuario> getTipoUsuarioById(Integer id) {
		return tipoUsuarioRepository.findById(id);
	}

	@Override
	public TipoUsuario saveTipoUsuario(TipoUsuario tipousuario) {
		return tipoUsuarioRepository.save(tipousuario);
	}

	@Override
	public void deleteTipoUsuario(Integer id) {
		tipoUsuarioRepository.deleteById(id);
	}
}
