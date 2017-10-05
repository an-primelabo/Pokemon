package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveFlagMap;
import com.pokemon.server.repository.IMoveFlagMapRepository;
import com.pokemon.server.service.IMoveFlagMapService;

@Service
public class MoveFlagMapServiceImpl implements IMoveFlagMapService {
	@Autowired
	IMoveFlagMapRepository repository;

	@Override
	public MoveFlagMap findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveFlagMap> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveFlagMap save(MoveFlagMap entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveFlagMap entity) {
		// TODO Auto-generated method stub
		return false;
	}
}