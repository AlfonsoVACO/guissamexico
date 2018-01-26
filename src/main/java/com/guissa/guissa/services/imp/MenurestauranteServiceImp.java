package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Menurestaurante;
import com.guissa.guissa.repositorys.MenurestauranteRepository;
import com.guissa.guissa.services.MenuRestauranteService;

@Service("servicioMenurestaurante")
public class MenurestauranteServiceImp implements MenuRestauranteService{

	@Autowired
	@Qualifier("menurestauranteRepository")
	private MenurestauranteRepository menurestauranteRepository;

	@Override
	public List<Menurestaurante> listAllMenurestaurante() {
		return menurestauranteRepository.findAll();
	}

	@Override
	public long menurestauranteCount() {
		return menurestauranteRepository.count();
	}

	@Override
	public Optional<Menurestaurante> getMenurestauranteById(Integer id) {
		return menurestauranteRepository.findById(id);
	}

	@Override
	public Menurestaurante saveMenurestaurante(Menurestaurante menurestaurante) {
		return menurestauranteRepository.save(menurestaurante);
	}

	@Override
	public void deleteMenurestaurante(Integer id) {
		menurestauranteRepository.deleteById(id);
		
	}
}
