package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestPokemonAbility;
import com.pokemon.server.repository.IConquestPokemonAbilityRepository;
import com.pokemon.server.service.IConquestPokemonAbilityService;

@Service
public class ConquestPokemonAbilityServiceImpl implements IConquestPokemonAbilityService {
	@Autowired
	IConquestPokemonAbilityRepository repository;

	@Override
	public ConquestPokemonAbility findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestPokemonAbility> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestPokemonAbility save(ConquestPokemonAbility entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestPokemonAbility entity) {
		// TODO Auto-generated method stub
		return false;
	}
}