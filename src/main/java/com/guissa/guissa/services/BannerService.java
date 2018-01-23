package com.guissa.guissa.services;

import java.util.List;
import java.util.Optional;

import com.guissa.guissa.models.entidades.Banner;

public interface BannerService {
	public abstract List<Banner> listAllBanner();
	public abstract Optional<Banner> getBannerById(Integer id);
	public abstract Banner saveBanner(Banner banner);
	public abstract void deleteBanner(Integer id);
}
