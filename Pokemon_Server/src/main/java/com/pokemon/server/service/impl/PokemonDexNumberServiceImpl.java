package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonDexNumber;
import com.pokemon.server.repository.IPokemonDexNumberRepository;
import com.pokemon.server.service.IPokemonDexNumberService;

@Service
public class PokemonDexNumberServiceImpl implements IPokemonDexNumberService {
	@Autowired
	IPokemonDexNumberRepository repository;

	@Override
	public PokemonDexNumber findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonDexNumber> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonDexNumber save(PokemonDexNumber entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonDexNumber entity) {
		// TODO Auto-generated method stub
		return false;
	}
}