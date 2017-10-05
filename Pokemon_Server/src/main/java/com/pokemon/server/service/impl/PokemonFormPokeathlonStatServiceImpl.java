package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonFormPokeathlonStat;
import com.pokemon.server.repository.IPokemonFormPokeathlonStatRepository;
import com.pokemon.server.service.IPokemonFormPokeathlonStatService;

@Service
public class PokemonFormPokeathlonStatServiceImpl implements IPokemonFormPokeathlonStatService {
	@Autowired
	IPokemonFormPokeathlonStatRepository repository;

	@Override
	public PokemonFormPokeathlonStat findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonFormPokeathlonStat> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonFormPokeathlonStat save(PokemonFormPokeathlonStat entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonFormPokeathlonStat entity) {
		// TODO Auto-generated method stub
		return false;
	}
}