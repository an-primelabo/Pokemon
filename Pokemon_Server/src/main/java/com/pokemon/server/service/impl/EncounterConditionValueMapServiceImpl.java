package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.EncounterConditionValueMap;
import com.pokemon.server.repository.IEncounterConditionValueMapRepository;
import com.pokemon.server.service.IEncounterConditionValueMapService;

@Service
public class EncounterConditionValueMapServiceImpl implements IEncounterConditionValueMapService {
	@Autowired
	IEncounterConditionValueMapRepository repository;

	@Override
	public EncounterConditionValueMap findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<EncounterConditionValueMap> getAll() {
		return repository.findAll();
	}

	@Override
	public EncounterConditionValueMap save(EncounterConditionValueMap entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(EncounterConditionValueMap entity) {
		// TODO Auto-generated method stub
		return false;
	}
}