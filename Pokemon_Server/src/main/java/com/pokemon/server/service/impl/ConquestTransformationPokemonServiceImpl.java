package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestTransformationPokemon;
import com.pokemon.server.repository.IConquestTransformationPokemonRepository;
import com.pokemon.server.service.IConquestTransformationPokemonService;

@Service
public class ConquestTransformationPokemonServiceImpl implements IConquestTransformationPokemonService {
	@Autowired
	IConquestTransformationPokemonRepository repository;

	@Override
	public ConquestTransformationPokemon findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestTransformationPokemon> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestTransformationPokemon save(ConquestTransformationPokemon entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestTransformationPokemon entity) {
		// TODO Auto-generated method stub
		return false;
	}
}