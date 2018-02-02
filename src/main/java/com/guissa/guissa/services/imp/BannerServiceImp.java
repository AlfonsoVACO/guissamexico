package com.guissa.guissa.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.Banner;
import com.guissa.guissa.repositorys.BannerRepository;
import com.guissa.guissa.services.BannerService;

@Service("servicioBanner")
public class BannerServiceImp implements BannerService{
	@Autowired
	private BannerRepository bannerRepository;

	@Override
	public List<Banner> listAllBanner() {
		return bannerRepository.findAll();
	}

	@Override
	public Optional<Banner> getBannerById(Integer id) {
		return bannerRepository.findById(id);
	}

	@Override
	public Banner saveBanner(Banner banner) {
		return bannerRepository.save(banner);
	}

	@Override
	public void deleteBanner(Integer id) {
		Optional<Banner> optionalbanner = getBannerById(id);
		Banner banner = optionalbanner.get();
		if(banner != null)
			bannerRepository.delete(banner);
	}
}
