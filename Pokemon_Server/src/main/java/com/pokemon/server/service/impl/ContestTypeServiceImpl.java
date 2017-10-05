package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ContestType;
import com.pokemon.server.repository.IContestTypeRepository;
import com.pokemon.server.service.IContestTypeService;

@Service
public class ContestTypeServiceImpl implements IContestTypeService {
	@Autowired
	IContestTypeRepository repository;

	@Override
	public ContestType findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ContestType> getAll() {
		return repository.findAll();
	}

	@Override
	public ContestType save(ContestType entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ContestType entity) {
		// TODO Auto-generated method stub
		return false;
	}
}