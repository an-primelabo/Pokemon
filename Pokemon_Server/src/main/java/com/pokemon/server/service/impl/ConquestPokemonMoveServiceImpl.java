package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestPokemonMove;
import com.pokemon.server.repository.IConquestPokemonMoveRepository;
import com.pokemon.server.service.IConquestPokemonMoveService;

@Service
public class ConquestPokemonMoveServiceImpl implements IConquestPokemonMoveService {
	@Autowired
	IConquestPokemonMoveRepository repository;

	@Override
	public ConquestPokemonMove findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestPokemonMove> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestPokemonMove save(ConquestPokemonMove entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestPokemonMove entity) {
		// TODO Auto-generated method stub
		return false;
	}
}