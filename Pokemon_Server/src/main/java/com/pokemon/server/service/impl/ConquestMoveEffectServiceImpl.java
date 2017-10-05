package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestMoveEffect;
import com.pokemon.server.repository.IConquestMoveEffectRepository;
import com.pokemon.server.service.IConquestMoveEffectService;

@Service
public class ConquestMoveEffectServiceImpl implements IConquestMoveEffectService {
	@Autowired
	IConquestMoveEffectRepository repository;

	@Override
	public ConquestMoveEffect findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestMoveEffect> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestMoveEffect save(ConquestMoveEffect entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestMoveEffect entity) {
		// TODO Auto-generated method stub
		return false;
	}
}