package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestStat;
import com.pokemon.server.repository.IConquestStatRepository;
import com.pokemon.server.service.IConquestStatService;

@Service
public class ConquestStatServiceImpl implements IConquestStatService {
	@Autowired
	IConquestStatRepository repository;

	@Override
	public ConquestStat findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestStat> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestStat save(ConquestStat entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestStat entity) {
		// TODO Auto-generated method stub
		return false;
	}
}