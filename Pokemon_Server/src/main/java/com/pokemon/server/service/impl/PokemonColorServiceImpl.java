package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonColor;
import com.pokemon.server.repository.IPokemonColorRepository;
import com.pokemon.server.service.IPokemonColorService;

@Service
public class PokemonColorServiceImpl implements IPokemonColorService {
	@Autowired
	IPokemonColorRepository repository;

	@Override
	public PokemonColor findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonColor> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonColor save(PokemonColor entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonColor entity) {
		// TODO Auto-generated method stub
		return false;
	}
}