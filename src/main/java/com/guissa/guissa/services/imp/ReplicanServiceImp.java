package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Replican;
import com.guissa.guissa.repositorys.ReplicaNRepository;
import com.guissa.guissa.services.ReplicanService;

@Service("servicioReplican")
public class ReplicanServiceImp implements ReplicanService{
	
	@Autowired
	@Qualifier("replicanRepository")
	private ReplicaNRepository replicanRepository;

	@Override
	public List<Replican> listAllReplican() {
		return replicanRepository.findAll();
	}

	@Override
	public long replicanCount() {
		return replicanRepository.count();
	}

	@Override
	public Optional<Replican> getReplicanById(Integer id) {
		return replicanRepository.findById(id);
	}

	@Override
	public Replican saveReplican(Replican replican) {
		return replicanRepository.save(replican);
	}

	@Override
	public void deleteReplican(Integer id) {
		replicanRepository.deleteById(id);
		
	}
}
