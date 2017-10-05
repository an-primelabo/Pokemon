package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestMoveDisplacement;
import com.pokemon.server.repository.IConquestMoveDisplacementRepository;
import com.pokemon.server.service.IConquestMoveDisplacementService;

@Service
public class ConquestMoveDisplacementServiceImpl implements IConquestMoveDisplacementService {
	@Autowired
	IConquestMoveDisplacementRepository repository;

	@Override
	public ConquestMoveDisplacement findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestMoveDisplacement> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestMoveDisplacement save(ConquestMoveDisplacement entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestMoveDisplacement entity) {
		// TODO Auto-generated method stub
		return false;
	}
}