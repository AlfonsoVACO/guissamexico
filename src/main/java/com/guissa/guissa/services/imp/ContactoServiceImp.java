package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Contacto;
import com.guissa.guissa.repositorys.ContactoRepository;
import com.guissa.guissa.services.ContactoService;

@Service("servicioContacto")
public class ContactoServiceImp implements ContactoService {

	@Autowired
	@Qualifier("contactoRepository")
	private ContactoRepository contactoRepository;

	@Override
	public List<Contacto> listAllContacto() {
		return contactoRepository.findAll();
	}

	@Override
	public long contactoCount() {
		return contactoRepository.count();
	}

	@Override
	public Optional<Contacto> getContactoById(Integer id) {
		return contactoRepository.findById(id);
	}

	@Override
	public Contacto saveContacto(Contacto contacto) {
		return contactoRepository.save(contacto);
	}

	@Override
	public void deleteContacto(Integer id) {
		Optional<Contacto> optionalContacto  = getContactoById(id);
		Contacto contacto = optionalContacto.get();
		if(contacto != null)
			contactoRepository.delete(contacto);
		
	}
}
