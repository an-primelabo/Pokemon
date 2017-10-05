package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.GrowthRate;
import com.pokemon.server.repository.IGrowthRateRepository;
import com.pokemon.server.service.IGrowthRateService;

@Service
public class GrowthRateServiceImpl implements IGrowthRateService {
	@Autowired
	IGrowthRateRepository repository;

	@Override
	public GrowthRate findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<GrowthRate> getAll() {
		return repository.findAll();
	}

	@Override
	public GrowthRate save(GrowthRate entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(GrowthRate entity) {
		// TODO Auto-generated method stub
		return false;
	}
}