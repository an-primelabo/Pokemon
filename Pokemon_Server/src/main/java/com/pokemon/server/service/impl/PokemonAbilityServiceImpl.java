package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonAbility;
import com.pokemon.server.repository.IPokemonAbilityRepository;
import com.pokemon.server.service.IPokemonAbilityService;

@Service
public class PokemonAbilityServiceImpl implements IPokemonAbilityService {
	@Autowired
	IPokemonAbilityRepository repository;

	@Override
	public PokemonAbility findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonAbility> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonAbility save(PokemonAbility entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonAbility entity) {
		// TODO Auto-generated method stub
		return false;
	}
}