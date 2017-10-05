package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonForm;
import com.pokemon.server.repository.IPokemonFormRepository;
import com.pokemon.server.service.IPokemonFormService;

@Service
public class PokemonFormServiceImpl implements IPokemonFormService {
	@Autowired
	IPokemonFormRepository repository;

	@Override
	public PokemonForm findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonForm> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonForm save(PokemonForm entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonForm entity) {
		// TODO Auto-generated method stub
		return false;
	}
}