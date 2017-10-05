package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestPokemonStat;
import com.pokemon.server.repository.IConquestPokemonStatRepository;
import com.pokemon.server.service.IConquestPokemonStatService;

@Service
public class ConquestPokemonStatServiceImpl implements IConquestPokemonStatService {
	@Autowired
	IConquestPokemonStatRepository repository;

	@Override
	public ConquestPokemonStat findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestPokemonStat> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestPokemonStat save(ConquestPokemonStat entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestPokemonStat entity) {
		// TODO Auto-generated method stub
		return false;
	}
}