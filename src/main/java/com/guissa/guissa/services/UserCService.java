package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Userc;

public interface UserCService {
	public abstract List<Userc> listAllUserc();
	public abstract long usercCount();
	public abstract Optional<Userc> getUsercById(Integer id);
	public abstract Userc saveUserc(Userc userc);
	public abstract void deleteUserc(Integer id);
}
