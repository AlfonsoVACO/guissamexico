package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.User;
import com.guissa.guissa.repositorys.UserRepository;
import com.guissa.guissa.services.UserService;

@Service("servicioUsers")
public class UserServiceImp implements UserService{
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;


	@Override
	public List<User> listAllUser() {
		return userRepository.findAll();
	}

	@Override
	public long userCount() {
		return userRepository.count();
	}

	@Override
	public Optional<User> getUserById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
		
	}
	
	@Override
	public User getUserByCriteria(Example<User> example) {
		Optional<User> isNull = userRepository.findOne(example);
		return isNull.isPresent() ? isNull.get() : new User();
	}
}
