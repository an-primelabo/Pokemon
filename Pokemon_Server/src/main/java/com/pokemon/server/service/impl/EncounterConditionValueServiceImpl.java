package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.EncounterConditionValue;
import com.pokemon.server.repository.IEncounterConditionValueRepository;
import com.pokemon.server.service.IEncounterConditionValueService;

@Service
public class EncounterConditionValueServiceImpl implements IEncounterConditionValueService {
	@Autowired
	IEncounterConditionValueRepository repository;

	@Override
	public EncounterConditionValue findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<EncounterConditionValue> getAll() {
		return repository.findAll();
	}

	@Override
	public EncounterConditionValue save(EncounterConditionValue entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(EncounterConditionValue entity) {
		// TODO Auto-generated method stub
		return false;
	}
}