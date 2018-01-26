package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Historys;

public interface HistorysService {
	public abstract List<Historys> listAllHistorys();
	public abstract long historysCount();
	public abstract Optional<Historys> getHistorysById(Integer id);
	public abstract Historys saveHistorys(Historys historys);
	public abstract void deleteHistorys(Integer id);
}
