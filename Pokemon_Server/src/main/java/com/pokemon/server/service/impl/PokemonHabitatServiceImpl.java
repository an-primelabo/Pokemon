package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonHabitat;
import com.pokemon.server.repository.IPokemonHabitatRepository;
import com.pokemon.server.service.IPokemonHabitatService;

@Service
public class PokemonHabitatServiceImpl implements IPokemonHabitatService {
	@Autowired
	IPokemonHabitatRepository repository;

	@Override
	public PokemonHabitat findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonHabitat> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonHabitat save(PokemonHabitat entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonHabitat entity) {
		// TODO Auto-generated method stub
		return false;
	}
}