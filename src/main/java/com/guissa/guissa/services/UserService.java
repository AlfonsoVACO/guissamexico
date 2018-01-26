package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.guissa.guissa.models.entidades.User;

public interface UserService {
	public abstract List<User> listAllUser();
	public abstract long userCount();
	public abstract Optional<User> getUserById(Integer id);
	public abstract User saveUser(User user);
	public abstract void deleteUser(Integer id);
}
