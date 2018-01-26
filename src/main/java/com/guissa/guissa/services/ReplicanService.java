package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Replican;

public interface ReplicanService {
	public abstract List<Replican> listAllReplican();
	public abstract long replicanCount();
	public abstract Optional<Replican> getReplicanById(Integer id);
	public abstract Replican saveReplican(Replican replican);
	public abstract void deleteReplican(Integer id);
}
