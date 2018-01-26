package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.ContactNegocios;

public interface ContactNegociosService {
	public abstract List<ContactNegocios> listAllContactNegocios();
	public abstract long contactnegociosCount();
	public abstract Optional<ContactNegocios> getContactNegociosById(Integer id);
	public abstract ContactNegocios saveContactNegocios(ContactNegocios contactnegocios);
	public abstract void deleteContactNegocios(Integer id);
}
