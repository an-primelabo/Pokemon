package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Nature;
import com.pokemon.server.repository.INatureRepository;
import com.pokemon.server.service.INatureService;

@Service
public class NatureServiceImpl implements INatureService {
	@Autowired
	INatureRepository repository;

	@Override
	public Nature findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Nature> getAll() {
		return repository.findAll();
	}

	@Override
	public Nature save(Nature entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Nature entity) {
		// TODO Auto-generated method stub
		return false;
	}
}