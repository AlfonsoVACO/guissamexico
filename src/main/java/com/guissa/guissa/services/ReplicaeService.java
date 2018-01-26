package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Replicae;

public interface ReplicaeService {
	public abstract List<Replicae> listAllReplicae();
	public abstract long replicaeCount();
	public abstract Optional<Replicae> getReplicaeById(Integer id);
	public abstract Replicae saveReplicae(Replicae replicae);
	public abstract void deleteReplicae(Integer id);
}
