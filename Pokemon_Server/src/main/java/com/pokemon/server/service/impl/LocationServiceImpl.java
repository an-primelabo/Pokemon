package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Location;
import com.pokemon.server.repository.ILocationRepository;
import com.pokemon.server.service.ILocationService;

@Service
public class LocationServiceImpl implements ILocationService {
	@Autowired
	ILocationRepository repository;

	@Override
	public Location findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Location> getAll() {
		return repository.findAll();
	}

	@Override
	public Location save(Location entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Location entity) {
		// TODO Auto-generated method stub
		return false;
	}
}