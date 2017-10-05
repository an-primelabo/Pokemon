package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Gender;
import com.pokemon.server.repository.IGenderRepository;
import com.pokemon.server.service.IGenderService;

@Service
public class GenderServiceImpl implements IGenderService {
	@Autowired
	IGenderRepository repository;

	@Override
	public Gender findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Gender> getAll() {
		return repository.findAll();
	}

	@Override
	public Gender save(Gender entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Gender entity) {
		// TODO Auto-generated method stub
		return false;
	}
}