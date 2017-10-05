package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.EvolutionChain;
import com.pokemon.server.repository.IEvolutionChainRepository;
import com.pokemon.server.service.IEvolutionChainService;

@Service
public class EvolutionChainServiceImpl implements IEvolutionChainService {
	@Autowired
	IEvolutionChainRepository repository;

	@Override
	public EvolutionChain findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<EvolutionChain> getAll() {
		return repository.findAll();
	}

	@Override
	public EvolutionChain save(EvolutionChain entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(EvolutionChain entity) {
		// TODO Auto-generated method stub
		return false;
	}
}