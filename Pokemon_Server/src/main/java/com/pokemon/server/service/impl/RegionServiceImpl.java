package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Region;
import com.pokemon.server.repository.IRegionRepository;
import com.pokemon.server.service.IRegionService;

@Service
public class RegionServiceImpl implements IRegionService {
	@Autowired
	IRegionRepository repository;

	@Override
	public Region findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Region> getAll() {
		return repository.findAll();
	}

	@Override
	public Region save(Region entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Region entity) {
		Region region = repository.findByNameAndNameAlias(entity.getName(), entity.getNameAlias());
		return (region != null);
	}
}