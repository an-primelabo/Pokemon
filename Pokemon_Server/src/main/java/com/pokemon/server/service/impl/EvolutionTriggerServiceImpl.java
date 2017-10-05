package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.EvolutionTrigger;
import com.pokemon.server.repository.IEvolutionTriggerRepository;
import com.pokemon.server.service.IEvolutionTriggerService;

@Service
public class EvolutionTriggerServiceImpl implements IEvolutionTriggerService {
	@Autowired
	IEvolutionTriggerRepository repository;

	@Override
	public EvolutionTrigger findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<EvolutionTrigger> getAll() {
		return repository.findAll();
	}

	@Override
	public EvolutionTrigger save(EvolutionTrigger entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(EvolutionTrigger entity) {
		// TODO Auto-generated method stub
		return false;
	}
}