package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.VersionGroupRegion;
import com.pokemon.server.repository.IVersionGroupRegionRepository;
import com.pokemon.server.service.IVersionGroupRegionService;

@Service
public class VersionGroupRegionServiceImpl implements IVersionGroupRegionService {
	@Autowired
	IVersionGroupRegionRepository repository;

	@Override
	public VersionGroupRegion findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<VersionGroupRegion> getAll() {
		return repository.findAll();
	}

	@Override
	public VersionGroupRegion save(VersionGroupRegion entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(VersionGroupRegion entity) {
		// TODO Auto-generated method stub
		return false;
	}
}