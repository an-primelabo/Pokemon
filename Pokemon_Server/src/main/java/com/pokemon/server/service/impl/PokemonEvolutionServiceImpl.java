package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonEvolution;
import com.pokemon.server.repository.IPokemonEvolutionRepository;
import com.pokemon.server.service.IPokemonEvolutionService;

@Service
public class PokemonEvolutionServiceImpl implements IPokemonEvolutionService {
	@Autowired
	IPokemonEvolutionRepository repository;

	@Override
	public PokemonEvolution findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonEvolution> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonEvolution save(PokemonEvolution entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonEvolution entity) {
		// TODO Auto-generated method stub
		return false;
	}
}