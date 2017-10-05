package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonSpeciesFlavorSummary;
import com.pokemon.server.repository.IPokemonSpeciesFlavorSummaryRepository;
import com.pokemon.server.service.IPokemonSpeciesFlavorSummaryService;

@Service
public class PokemonSpeciesFlavorSummaryServiceImpl implements IPokemonSpeciesFlavorSummaryService {
	@Autowired
	IPokemonSpeciesFlavorSummaryRepository repository;

	@Override
	public PokemonSpeciesFlavorSummary findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonSpeciesFlavorSummary> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonSpeciesFlavorSummary save(PokemonSpeciesFlavorSummary entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonSpeciesFlavorSummary entity) {
		// TODO Auto-generated method stub
		return false;
	}
}