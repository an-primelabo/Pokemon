package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.SuperContestEffect;
import com.pokemon.server.repository.ISuperContestEffectRepository;
import com.pokemon.server.service.ISuperContestEffectService;

@Service
public class SuperContestEffectServiceImpl implements ISuperContestEffectService {
	@Autowired
	ISuperContestEffectRepository repository;

	@Override
	public SuperContestEffect findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<SuperContestEffect> getAll() {
		return repository.findAll();
	}

	@Override
	public SuperContestEffect save(SuperContestEffect entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(SuperContestEffect entity) {
		// TODO Auto-generated method stub
		return false;
	}
}