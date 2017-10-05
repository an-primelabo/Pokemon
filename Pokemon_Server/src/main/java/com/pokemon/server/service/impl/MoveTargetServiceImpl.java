package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveTarget;
import com.pokemon.server.repository.IMoveTargetRepository;
import com.pokemon.server.service.IMoveTargetService;

@Service
public class MoveTargetServiceImpl implements IMoveTargetService {
	@Autowired
	IMoveTargetRepository repository;

	@Override
	public MoveTarget findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveTarget> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveTarget save(MoveTarget entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveTarget entity) {
		// TODO Auto-generated method stub
		return false;
	}
}