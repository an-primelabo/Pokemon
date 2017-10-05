package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Ability;
import com.pokemon.server.repository.IAbilityRepository;
import com.pokemon.server.service.IAbilityService;

@Service
public class AbilityServiceImpl implements IAbilityService {
	@Autowired
	IAbilityRepository repository;

	@Override
	public Ability findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Ability> getAll() {
		return repository.findAll();
	}

	@Override
	public Ability save(Ability entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Ability entity) {
		// TODO Auto-generated method stub
		return false;
	}
}