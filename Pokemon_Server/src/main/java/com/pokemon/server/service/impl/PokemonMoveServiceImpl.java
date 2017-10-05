package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonMove;
import com.pokemon.server.repository.IPokemonMoveRepository;
import com.pokemon.server.service.IPokemonMoveService;

@Service
public class PokemonMoveServiceImpl implements IPokemonMoveService {
	@Autowired
	IPokemonMoveRepository repository;

	@Override
	public PokemonMove findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonMove> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonMove save(PokemonMove entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonMove entity) {
		// TODO Auto-generated method stub
		return false;
	}
}