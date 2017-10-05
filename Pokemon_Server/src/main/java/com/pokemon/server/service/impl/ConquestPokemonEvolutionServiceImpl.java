package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestPokemonEvolution;
import com.pokemon.server.repository.IConquestPokemonEvolutionRepository;
import com.pokemon.server.service.IConquestPokemonEvolutionService;

@Service
public class ConquestPokemonEvolutionServiceImpl implements IConquestPokemonEvolutionService {
	@Autowired
	IConquestPokemonEvolutionRepository repository;

	@Override
	public ConquestPokemonEvolution findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestPokemonEvolution> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestPokemonEvolution save(ConquestPokemonEvolution entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestPokemonEvolution entity) {
		// TODO Auto-generated method stub
		return false;
	}
}