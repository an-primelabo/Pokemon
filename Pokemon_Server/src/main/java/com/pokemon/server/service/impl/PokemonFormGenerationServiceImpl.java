package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonFormGeneration;
import com.pokemon.server.repository.IPokemonFormGenerationRepository;
import com.pokemon.server.service.IPokemonFormGenerationService;

@Service
public class PokemonFormGenerationServiceImpl implements IPokemonFormGenerationService {
	@Autowired
	IPokemonFormGenerationRepository repository;

	@Override
	public PokemonFormGeneration findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonFormGeneration> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonFormGeneration save(PokemonFormGeneration entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonFormGeneration entity) {
		// TODO Auto-generated method stub
		return false;
	}
}