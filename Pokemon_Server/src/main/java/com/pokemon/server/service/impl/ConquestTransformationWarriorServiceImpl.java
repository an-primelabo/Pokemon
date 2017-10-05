package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestTransformationWarrior;
import com.pokemon.server.repository.IConquestTransformationWarriorRepository;
import com.pokemon.server.service.IConquestTransformationWarriorService;

@Service
public class ConquestTransformationWarriorServiceImpl implements IConquestTransformationWarriorService {
	@Autowired
	IConquestTransformationWarriorRepository repository;

	@Override
	public ConquestTransformationWarrior findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestTransformationWarrior> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestTransformationWarrior save(ConquestTransformationWarrior entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestTransformationWarrior entity) {
		// TODO Auto-generated method stub
		return false;
	}
}