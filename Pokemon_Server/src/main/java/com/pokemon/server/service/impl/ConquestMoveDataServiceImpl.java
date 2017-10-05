package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestMoveData;
import com.pokemon.server.repository.IConquestMoveDataRepository;
import com.pokemon.server.service.IConquestMoveDataService;

@Service
public class ConquestMoveDataServiceImpl implements IConquestMoveDataService {
	@Autowired
	IConquestMoveDataRepository repository;

	@Override
	public ConquestMoveData findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestMoveData> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestMoveData save(ConquestMoveData entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestMoveData entity) {
		// TODO Auto-generated method stub
		return false;
	}
}