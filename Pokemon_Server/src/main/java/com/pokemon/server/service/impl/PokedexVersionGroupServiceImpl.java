package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokedexVersionGroup;
import com.pokemon.server.repository.IPokedexVersionGroupRepository;
import com.pokemon.server.service.IPokedexVersionGroupService;

@Service
public class PokedexVersionGroupServiceImpl implements IPokedexVersionGroupService {
	@Autowired
	IPokedexVersionGroupRepository repository;

	@Override
	public PokedexVersionGroup findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokedexVersionGroup> getAll() {
		return repository.findAll();
	}

	@Override
	public PokedexVersionGroup save(PokedexVersionGroup entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokedexVersionGroup entity) {
		// TODO Auto-generated method stub
		return false;
	}
}