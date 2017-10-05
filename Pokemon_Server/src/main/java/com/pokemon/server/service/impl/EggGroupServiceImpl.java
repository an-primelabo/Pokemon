package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.EggGroup;
import com.pokemon.server.repository.IEggGroupRepository;
import com.pokemon.server.service.IEggGroupService;

@Service
public class EggGroupServiceImpl implements IEggGroupService {
	@Autowired
	IEggGroupRepository repository;

	@Override
	public EggGroup findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<EggGroup> getAll() {
		return repository.findAll();
	}

	@Override
	public EggGroup save(EggGroup entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(EggGroup entity) {
		// TODO Auto-generated method stub
		return false;
	}
}