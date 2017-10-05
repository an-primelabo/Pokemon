package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokemonItem;
import com.pokemon.server.repository.IPokemonItemRepository;
import com.pokemon.server.service.IPokemonItemService;

@Service
public class PokemonItemServiceImpl implements IPokemonItemService {
	@Autowired
	IPokemonItemRepository repository;

	@Override
	public PokemonItem findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokemonItem> getAll() {
		return repository.findAll();
	}

	@Override
	public PokemonItem save(PokemonItem entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokemonItem entity) {
		// TODO Auto-generated method stub
		return false;
	}
}