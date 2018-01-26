package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.ContactNegocios;
import com.guissa.guissa.repositorys.ContactNegocioRepository;
import com.guissa.guissa.services.ContactNegociosService;

@Service("servicioContactNegocios")
public class ContactNegociosServiceImp implements ContactNegociosService {

	@Autowired
	@Qualifier("contactNegocioRepository")
	private ContactNegocioRepository contactNegocioRepository;

	@Override
	public List<ContactNegocios> listAllContactNegocios() {
		return contactNegocioRepository.findAll();
	}

	@Override
	public long contactnegociosCount() {
		return contactNegocioRepository.count();
	}

	@Override
	public Optional<ContactNegocios> getContactNegociosById(Integer id) {
		return contactNegocioRepository.findById(id);
	}

	@Override
	public ContactNegocios saveContactNegocios(ContactNegocios contactnegocios) {
		return contactNegocioRepository.save(contactnegocios);
	}

	@Override
	public void deleteContactNegocios(Integer id) {
		contactNegocioRepository.deleteById(id);
		
	}
}
