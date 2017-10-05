package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestWarrior;
import com.pokemon.server.repository.IConquestWarriorRepository;
import com.pokemon.server.service.IConquestWarriorService;

@Service
public class ConquestWarriorServiceImpl implements IConquestWarriorService {
	@Autowired
	IConquestWarriorRepository repository;

	@Override
	public ConquestWarrior findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestWarrior> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestWarrior save(ConquestWarrior entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestWarrior entity) {
		// TODO Auto-generated method stub
		return false;
	}
}