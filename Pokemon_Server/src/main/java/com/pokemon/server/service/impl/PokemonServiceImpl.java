package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Pokemon;
import com.pokemon.server.repository.IPokemonRepository;
import com.pokemon.server.service.IPokemonService;

@Service
public class PokemonServiceImpl implements IPokemonService {
	@Autowired
	IPokemonRepository repository;

	@Override
	public Pokemon findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Pokemon> getAll() {
		return repository.findAll();
	}

	@Override
	public Pokemon save(Pokemon entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Pokemon entity) {
		// TODO Auto-generated method stub
		return false;
	}
}