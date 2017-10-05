package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Move;
import com.pokemon.server.repository.IMoveRepository;
import com.pokemon.server.service.IMoveService;

@Service
public class MoveServiceImpl implements IMoveService {
	@Autowired
	IMoveRepository repository;

	@Override
	public Move findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Move> getAll() {
		return repository.findAll();
	}

	@Override
	public Move save(Move entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Move entity) {
		// TODO Auto-generated method stub
		return false;
	}
}