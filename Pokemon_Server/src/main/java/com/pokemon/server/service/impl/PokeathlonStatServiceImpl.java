package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PokeathlonStat;
import com.pokemon.server.repository.IPokeathlonStatRepository;
import com.pokemon.server.service.IPokeathlonStatService;

@Service
public class PokeathlonStatServiceImpl implements IPokeathlonStatService {
	@Autowired
	IPokeathlonStatRepository repository;

	@Override
	public PokeathlonStat findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PokeathlonStat> getAll() {
		return repository.findAll();
	}

	@Override
	public PokeathlonStat save(PokeathlonStat entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PokeathlonStat entity) {
		// TODO Auto-generated method stub
		return false;
	}
}