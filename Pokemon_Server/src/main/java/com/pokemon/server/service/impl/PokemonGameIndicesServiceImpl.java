package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonGameIndices;
import com.pokemon.server.repository.IPokemonGameIndicesRepository;
import com.pokemon.server.service.IPokemonGameIndicesService;

@Service
public class PokemonGameIndicesServiceImpl implements IPokemonGameIndicesService {
	@Autowired
	IPokemonGameIndicesRepository repository;

	@Override
	public PokemonGameIndices findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonGameIndices> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonGameIndices save(PokemonGameIndices entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonGameIndices entity) {
		// TODO Auto-generated method stub
		return false;
	}
}