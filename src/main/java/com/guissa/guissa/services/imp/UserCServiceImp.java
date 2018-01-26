package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Userc;
import com.guissa.guissa.repositorys.UserCRepository;
import com.guissa.guissa.services.UserCService;

@Service("servicioUserc")
public class UserCServiceImp implements UserCService{

	@Autowired
	@Qualifier("usercRepository")
	private UserCRepository usercRepository;

	@Override
	public List<Userc> listAllUserc() {
		return usercRepository.findAll();
	}

	@Override
	public long usercCount() {
		return usercRepository.count();
	}

	@Override
	public Optional<Userc> getUsercById(Integer id) {
		return usercRepository.findById(id);
	}

	@Override
	public Userc saveUserc(Userc userc) {
		return usercRepository.save(userc);
	}

	@Override
	public void deleteUserc(Integer id) {
		usercRepository.deleteById(id);
		
	}
}
