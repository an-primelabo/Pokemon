package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.EncounterCondition;
import com.pokemon.server.repository.IEncounterConditionRepository;
import com.pokemon.server.service.IEncounterConditionService;

@Service
public class EncounterConditionServiceImpl implements IEncounterConditionService {
	@Autowired
	IEncounterConditionRepository repository;

	@Override
	public EncounterCondition findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<EncounterCondition> getAll() {
		return repository.findAll();
	}

	@Override
	public EncounterCondition save(EncounterCondition entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(EncounterCondition entity) {
		// TODO Auto-generated method stub
		return false;
	}
}