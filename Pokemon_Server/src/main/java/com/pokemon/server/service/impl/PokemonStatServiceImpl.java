package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonStat;
import com.pokemon.server.repository.IPokemonStatRepository;
import com.pokemon.server.service.IPokemonStatService;

@Service
public class PokemonStatServiceImpl implements IPokemonStatService {
	@Autowired
	IPokemonStatRepository repository;

	@Override
	public PokemonStat findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonStat> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonStat save(PokemonStat entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonStat entity) {
		// TODO Auto-generated method stub
		return false;
	}
}