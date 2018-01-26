package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Contacto;

public interface ContactoService {
	public abstract List<Contacto> listAllContacto();
	public abstract long contactoCount();
	public abstract Optional<Contacto> getContactoById(Integer id);
	public abstract Contacto saveContacto(Contacto contacto);
	public abstract void deleteContacto(Integer id);
}
