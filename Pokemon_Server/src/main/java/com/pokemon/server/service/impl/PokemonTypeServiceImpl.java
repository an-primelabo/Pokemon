package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonType;
import com.pokemon.server.repository.IPokemonTypeRepository;
import com.pokemon.server.service.IPokemonTypeService;

@Service
public class PokemonTypeServiceImpl implements IPokemonTypeService {
	@Autowired
	IPokemonTypeRepository repository;

	@Override
	public PokemonType findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonType> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonType save(PokemonType entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonType entity) {
		// TODO Auto-generated method stub
		return false;
	}
}