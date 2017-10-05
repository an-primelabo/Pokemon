package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonEggGroup;
import com.pokemon.server.repository.IPokemonEggGroupRepository;
import com.pokemon.server.service.IPokemonEggGroupService;

@Service
public class PokemonEggGroupServiceImpl implements IPokemonEggGroupService {
	@Autowired
	IPokemonEggGroupRepository repository;

	@Override
	public PokemonEggGroup findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonEggGroup> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonEggGroup save(PokemonEggGroup entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonEggGroup entity) {
		// TODO Auto-generated method stub
		return false;
	}
}