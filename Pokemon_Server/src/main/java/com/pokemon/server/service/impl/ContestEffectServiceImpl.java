package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ContestEffect;
import com.pokemon.server.repository.IContestEffectRepository;
import com.pokemon.server.service.IContestEffectService;

@Service
public class ContestEffectServiceImpl implements IContestEffectService {
	@Autowired
	IContestEffectRepository repository;

	@Override
	public ContestEffect findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ContestEffect> getAll() {
		return repository.findAll();
	}

	@Override
	public ContestEffect save(ContestEffect entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ContestEffect entity) {
		// TODO Auto-generated method stub
		return false;
	}
}