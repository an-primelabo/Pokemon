package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Pokedex;
import com.pokemon.server.repository.IPokedexRepository;
import com.pokemon.server.service.IPokedexService;

@Service
public class PokedexServiceImpl implements IPokedexService {
	@Autowired
	IPokedexRepository repository;

	@Override
	public Pokedex findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Pokedex> getAll() {
		return repository.findAll();
	}

	@Override
	public Pokedex save(Pokedex entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Pokedex entity) {
		// TODO Auto-generated method stub
		return false;
	}
}