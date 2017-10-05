package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.LocationGameIndices;
import com.pokemon.server.repository.ILocationGameIndicesRepository;
import com.pokemon.server.service.ILocationGameIndicesService;

@Service
public class LocationGameIndicesServiceImpl implements ILocationGameIndicesService {
	@Autowired
	ILocationGameIndicesRepository repository;

	@Override
	public LocationGameIndices findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<LocationGameIndices> getAll() {
		return repository.findAll();
	}

	@Override
	public LocationGameIndices save(LocationGameIndices entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(LocationGameIndices entity) {
		// TODO Auto-generated method stub
		return false;
	}
}