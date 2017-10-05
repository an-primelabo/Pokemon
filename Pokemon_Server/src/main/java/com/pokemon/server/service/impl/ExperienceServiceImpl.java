package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Experience;
import com.pokemon.server.repository.IExperienceRepository;
import com.pokemon.server.service.IExperienceService;

@Service
public class ExperienceServiceImpl implements IExperienceService {
	@Autowired
	IExperienceRepository repository;

	@Override
	public Experience findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Experience> getAll() {
		return repository.findAll();
	}

	@Override
	public Experience save(Experience entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Experience entity) {
		// TODO Auto-generated method stub
		return false;
	}
}