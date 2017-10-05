package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.LocationArea;
import com.pokemon.server.repository.ILocationAreaRepository;
import com.pokemon.server.service.ILocationAreaService;

@Service
public class LocationAreaServiceImpl implements ILocationAreaService {
	@Autowired
	ILocationAreaRepository repository;

	@Override
	public LocationArea findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<LocationArea> getAll() {
		return repository.findAll();
	}

	@Override
	public LocationArea save(LocationArea entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(LocationArea entity) {
		// TODO Auto-generated method stub
		return false;
	}
}