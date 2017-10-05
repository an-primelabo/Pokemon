package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonMoveMethod;
import com.pokemon.server.repository.IPokemonMoveMethodRepository;
import com.pokemon.server.service.IPokemonMoveMethodService;

@Service
public class PokemonMoveMethodServiceImpl implements IPokemonMoveMethodService {
	@Autowired
	IPokemonMoveMethodRepository repository;

	@Override
	public PokemonMoveMethod findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonMoveMethod> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonMoveMethod save(PokemonMoveMethod entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonMoveMethod entity) {
		// TODO Auto-generated method stub
		return false;
	}
}