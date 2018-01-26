package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.GaleriaNs;

public interface GaleriaNsService {
	public abstract List<GaleriaNs> listAllGaleriaNs();
	public abstract long galeriaNsCount();
	public abstract Optional<GaleriaNs> getGaleriaNsById(Integer id);
	public abstract GaleriaNs saveGaleriaNs(GaleriaNs galeriaNs);
	public abstract void deleteGaleriaNs(Integer id);
}
