package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonShape;
import com.pokemon.server.repository.IPokemonShapeRepository;
import com.pokemon.server.service.IPokemonShapeService;

@Service
public class PokemonShapeServiceImpl implements IPokemonShapeService {
	@Autowired
	IPokemonShapeRepository repository;

	@Override
	public PokemonShape findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonShape> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonShape save(PokemonShape entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonShape entity) {
		// TODO Auto-generated method stub
		return false;
	}
}