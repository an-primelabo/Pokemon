package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonSpecies;
import com.pokemon.server.repository.IPokemonSpeciesRepository;
import com.pokemon.server.service.IPokemonSpeciesService;

@Service
public class PokemonSpeciesServiceImpl implements IPokemonSpeciesService {
	@Autowired
	IPokemonSpeciesRepository repository;

	@Override
	public PokemonSpecies findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonSpecies> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonSpecies save(PokemonSpecies entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonSpecies entity) {
		// TODO Auto-generated method stub
		return false;
	}
}