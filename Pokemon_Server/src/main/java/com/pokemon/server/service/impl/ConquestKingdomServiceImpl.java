package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestKingdom;
import com.pokemon.server.repository.IConquestKingdomRepository;
import com.pokemon.server.service.IConquestKingdomService;

@Service
public class ConquestKingdomServiceImpl implements IConquestKingdomService {
	@Autowired
	IConquestKingdomRepository repository;

	@Override
	public ConquestKingdom findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestKingdom> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestKingdom save(ConquestKingdom entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestKingdom entity) {
		// TODO Auto-generated method stub
		return false;
	}
}