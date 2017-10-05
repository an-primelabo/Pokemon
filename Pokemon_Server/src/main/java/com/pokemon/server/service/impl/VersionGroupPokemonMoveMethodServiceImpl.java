package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.VersionGroupPokemonMoveMethod;
import com.pokemon.server.repository.IVersionGroupPokemonMoveMethodRepository;
import com.pokemon.server.service.IVersionGroupPokemonMoveMethodService;

@Service
public class VersionGroupPokemonMoveMethodServiceImpl implements IVersionGroupPokemonMoveMethodService {
	@Autowired
	IVersionGroupPokemonMoveMethodRepository repository;

	@Override
	public VersionGroupPokemonMoveMethod findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<VersionGroupPokemonMoveMethod> getAll() {
		return repository.findAll();
	}

	@Override
	public VersionGroupPokemonMoveMethod save(VersionGroupPokemonMoveMethod entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(VersionGroupPokemonMoveMethod entity) {
		// TODO Auto-generated method stub
		return false;
	}
}