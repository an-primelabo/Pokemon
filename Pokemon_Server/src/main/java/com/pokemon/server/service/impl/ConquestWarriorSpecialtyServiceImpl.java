package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestWarriorSpecialty;
import com.pokemon.server.repository.IConquestWarriorSpecialtyRepository;
import com.pokemon.server.service.IConquestWarriorSpecialtyService;

@Service
public class ConquestWarriorSpecialtyServiceImpl implements IConquestWarriorSpecialtyService {
	@Autowired
	IConquestWarriorSpecialtyRepository repository;

	@Override
	public ConquestWarriorSpecialty findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestWarriorSpecialty> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestWarriorSpecialty save(ConquestWarriorSpecialty entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestWarriorSpecialty entity) {
		// TODO Auto-generated method stub
		return false;
	}
}