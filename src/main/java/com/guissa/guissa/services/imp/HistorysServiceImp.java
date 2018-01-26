package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Historys;
import com.guissa.guissa.repositorys.HistorysRepository;
import com.guissa.guissa.services.HistorysService;

@Service("servicioHistorys")
public class HistorysServiceImp implements HistorysService {

	@Autowired
	@Qualifier("historysRepository")
	private HistorysRepository historysRepository;

	@Override
	public List<Historys> listAllHistorys() {
		return historysRepository.findAll();
	}

	@Override
	public long historysCount() {
		return historysRepository.count();
	}

	@Override
	public Optional<Historys> getHistorysById(Integer id) {
		return historysRepository.findById(id);
	}

	@Override
	public Historys saveHistorys(Historys historys) {
		return historysRepository.save(historys);
	}

	@Override
	public void deleteHistorys(Integer id) {
		historysRepository.deleteById(id);
		
	}
}
