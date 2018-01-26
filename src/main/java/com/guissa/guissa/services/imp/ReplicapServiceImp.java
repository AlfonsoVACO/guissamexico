package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Replicap;
import com.guissa.guissa.repositorys.ReplicaPRepository;
import com.guissa.guissa.services.ReplicapService;

@Service("servicioReplicap")
public class ReplicapServiceImp implements ReplicapService{
	
	@Autowired
	@Qualifier("replicapRepository")
	private ReplicaPRepository replicapRepository;

	@Override
	public List<Replicap> listAllReplicap() {
		return replicapRepository.findAll();
	}

	@Override
	public long replicapCount() {
		return replicapRepository.count();
	}

	@Override
	public Optional<Replicap> getReplicapById(Integer id) {
		return replicapRepository.findById(id);
	}

	@Override
	public Replicap saveReplicap(Replicap replicap) {
		return replicapRepository.save(replicap);
	}

	@Override
	public void deleteReplicap(Integer id) {
		replicapRepository.deleteById(id);
		
	}
}
