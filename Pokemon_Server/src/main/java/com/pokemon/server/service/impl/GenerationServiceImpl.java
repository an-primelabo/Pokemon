package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Generation;
import com.pokemon.server.repository.IGenerationRepository;
import com.pokemon.server.service.IGenerationService;

@Service
public class GenerationServiceImpl implements IGenerationService {
	@Autowired
	IGenerationRepository repository;

	@Override
	public Generation findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Generation> getAll() {
		return repository.findAll();
	}

	@Override
	public Generation save(Generation entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Generation entity) {
		// TODO Auto-generated method stub
		return false;
	}
}