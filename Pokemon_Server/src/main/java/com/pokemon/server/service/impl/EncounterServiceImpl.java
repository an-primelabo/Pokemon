package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Encounter;
import com.pokemon.server.repository.IEncounterRepository;
import com.pokemon.server.service.IEncounterService;

@Service
public class EncounterServiceImpl implements IEncounterService {
	@Autowired
	IEncounterRepository repository;

	@Override
	public Encounter findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Encounter> getAll() {
		return repository.findAll();
	}

	@Override
	public Encounter save(Encounter entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Encounter entity) {
		// TODO Auto-generated method stub
		return false;
	}
}