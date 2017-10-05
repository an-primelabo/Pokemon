package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveEffect;
import com.pokemon.server.repository.IMoveEffectRepository;
import com.pokemon.server.service.IMoveEffectService;

@Service
public class MoveEffectServiceImpl implements IMoveEffectService {
	@Autowired
	IMoveEffectRepository repository;

	@Override
	public MoveEffect findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveEffect> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveEffect save(MoveEffect entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveEffect entity) {
		// TODO Auto-generated method stub
		return false;
	}
}