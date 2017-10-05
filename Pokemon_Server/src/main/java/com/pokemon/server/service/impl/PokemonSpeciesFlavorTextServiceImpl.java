package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonSpeciesFlavorText;
import com.pokemon.server.repository.IPokemonSpeciesFlavorTextRepository;
import com.pokemon.server.service.IPokemonSpeciesFlavorTextService;

@Service
public class PokemonSpeciesFlavorTextServiceImpl implements IPokemonSpeciesFlavorTextService {
	@Autowired
	IPokemonSpeciesFlavorTextRepository repository;

	@Override
	public PokemonSpeciesFlavorText findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonSpeciesFlavorText> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonSpeciesFlavorText save(PokemonSpeciesFlavorText entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonSpeciesFlavorText entity) {
		// TODO Auto-generated method stub
		return false;
	}
}