package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Berry;
import com.pokemon.server.repository.IBerryRepository;
import com.pokemon.server.service.IBerryService;

@Service
public class BerryServiceImpl implements IBerryService {
	@Autowired
	IBerryRepository repository;

	@Override
	public Berry findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Berry> getAll() {
		return repository.findAll();
	}

	@Override
	public Berry save(Berry entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Berry entity) {
		// TODO Auto-generated method stub
		return false;
	}
}