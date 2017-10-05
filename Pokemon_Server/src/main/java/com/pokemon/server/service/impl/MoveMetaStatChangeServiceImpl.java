package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveMetaStatChange;
import com.pokemon.server.repository.IMoveMetaStatChangeRepository;
import com.pokemon.server.service.IMoveMetaStatChangeService;

@Service
public class MoveMetaStatChangeServiceImpl implements IMoveMetaStatChangeService {
	@Autowired
	IMoveMetaStatChangeRepository repository;

	@Override
	public MoveMetaStatChange findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveMetaStatChange> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveMetaStatChange save(MoveMetaStatChange entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveMetaStatChange entity) {
		// TODO Auto-generated method stub
		return false;
	}
}