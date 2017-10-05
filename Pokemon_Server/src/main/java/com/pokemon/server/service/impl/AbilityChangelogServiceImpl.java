package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.AbilityChangelog;
import com.pokemon.server.repository.IAbilityChangelogRepository;
import com.pokemon.server.service.IAbilityChangelogService;

@Service
public class AbilityChangelogServiceImpl implements IAbilityChangelogService {
	@Autowired
	IAbilityChangelogRepository repository;

	@Override
	public AbilityChangelog findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<AbilityChangelog> getAll() {
		return repository.findAll();
	}

	@Override
	public AbilityChangelog save(AbilityChangelog entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(AbilityChangelog entity) {
		// TODO Auto-generated method stub
		return false;
	}
}