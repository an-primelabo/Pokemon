package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.NatureBattleStylePreference;
import com.pokemon.server.repository.INatureBattleStylePreferenceRepository;
import com.pokemon.server.service.INatureBattleStylePreferenceService;

@Service
public class NatureBattleStylePreferenceServiceImpl implements INatureBattleStylePreferenceService {
	@Autowired
	INatureBattleStylePreferenceRepository repository;

	@Override
	public NatureBattleStylePreference findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<NatureBattleStylePreference> getAll() {
		return repository.findAll();
	}

	@Override
	public NatureBattleStylePreference save(NatureBattleStylePreference entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(NatureBattleStylePreference entity) {
		// TODO Auto-generated method stub
		return false;
	}
}