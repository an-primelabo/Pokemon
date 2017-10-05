package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestWarriorArchetype;
import com.pokemon.server.repository.IConquestWarriorArchetypeRepository;
import com.pokemon.server.service.IConquestWarriorArchetypeService;

@Service
public class ConquestWarriorArchetypeServiceImpl implements IConquestWarriorArchetypeService {
	@Autowired
	IConquestWarriorArchetypeRepository repository;

	@Override
	public ConquestWarriorArchetype findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestWarriorArchetype> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestWarriorArchetype save(ConquestWarriorArchetype entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestWarriorArchetype entity) {
		// TODO Auto-generated method stub
		return false;
	}
}