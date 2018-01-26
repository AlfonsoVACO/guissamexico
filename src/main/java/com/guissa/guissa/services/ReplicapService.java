package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Replicap;

public interface ReplicapService {
	public abstract List<Replicap> listAllReplicap();
	public abstract long replicapCount();
	public abstract Optional<Replicap> getReplicapById(Integer id);
	public abstract Replicap saveReplicap(Replicap replicap);
	public abstract void deleteReplicap(Integer id);
}
