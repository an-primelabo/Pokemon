package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Stat;
import com.pokemon.server.repository.IStatRepository;
import com.pokemon.server.service.IStatService;

@Service
public class StatServiceImpl implements IStatService {
	@Autowired
	IStatRepository repository;

	@Override
	public Stat findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Stat> getAll() {
		return repository.findAll();
	}

	@Override
	public Stat save(Stat entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Stat entity) {
		// TODO Auto-generated method stub
		return false;
	}
}