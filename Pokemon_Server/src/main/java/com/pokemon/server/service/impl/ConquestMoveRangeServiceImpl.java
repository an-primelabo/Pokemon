package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestMoveRange;
import com.pokemon.server.repository.IConquestMoveRangeRepository;
import com.pokemon.server.service.IConquestMoveRangeService;

@Service
public class ConquestMoveRangeServiceImpl implements IConquestMoveRangeService {
	@Autowired
	IConquestMoveRangeRepository repository;

	@Override
	public ConquestMoveRange findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestMoveRange> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestMoveRange save(ConquestMoveRange entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestMoveRange entity) {
		// TODO Auto-generated method stub
		return false;
	}
}