package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestWarriorTransformation;
import com.pokemon.server.repository.IConquestWarriorTransformationRepository;
import com.pokemon.server.service.IConquestWarriorTransformationService;

@Service
public class ConquestWarriorTransformationServiceImpl implements IConquestWarriorTransformationService {
	@Autowired
	IConquestWarriorTransformationRepository repository;

	@Override
	public ConquestWarriorTransformation findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestWarriorTransformation> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestWarriorTransformation save(ConquestWarriorTransformation entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestWarriorTransformation entity) {
		// TODO Auto-generated method stub
		return false;
	}
}