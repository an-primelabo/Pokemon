package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveBattleStyle;
import com.pokemon.server.repository.IMoveBattleStyleRepository;
import com.pokemon.server.service.IMoveBattleStyleService;

@Service
public class MoveBattleStyleServiceImpl implements IMoveBattleStyleService {
	@Autowired
	IMoveBattleStyleRepository repository;

	@Override
	public MoveBattleStyle findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveBattleStyle> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveBattleStyle save(MoveBattleStyle entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveBattleStyle entity) {
		// TODO Auto-generated method stub
		return false;
	}
}