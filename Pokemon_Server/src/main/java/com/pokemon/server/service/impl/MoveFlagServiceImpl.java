package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveFlag;
import com.pokemon.server.repository.IMoveFlagRepository;
import com.pokemon.server.service.IMoveFlagService;

@Service
public class MoveFlagServiceImpl implements IMoveFlagService {
	@Autowired
	IMoveFlagRepository repository;

	@Override
	public MoveFlag findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveFlag> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveFlag save(MoveFlag entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveFlag entity) {
		// TODO Auto-generated method stub
		return false;
	}
}