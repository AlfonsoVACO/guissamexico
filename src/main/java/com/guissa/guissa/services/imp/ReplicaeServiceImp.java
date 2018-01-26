package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Replicae;
import com.guissa.guissa.repositorys.ReplicaERepository;
import com.guissa.guissa.services.ReplicaeService;

@Service("servicioReplicae")
public class ReplicaeServiceImp implements ReplicaeService{

	@Autowired
	@Qualifier("replicaeRepository")
	private ReplicaERepository replicaeRepository;

	@Override
	public List<Replicae> listAllReplicae() {
		return replicaeRepository.findAll();
	}

	@Override
	public long replicaeCount() {
		return replicaeRepository.count();
	}

	@Override
	public Optional<Replicae> getReplicaeById(Integer id) {
		return replicaeRepository.findById(id);
	}

	@Override
	public Replicae saveReplicae(Replicae replicae) {
		return replicaeRepository.save(replicae);
	}

	@Override
	public void deleteReplicae(Integer id) {
		replicaeRepository.deleteById(id);
		
	}
}
