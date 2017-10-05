package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestWarriorRankStatMap;
import com.pokemon.server.repository.IConquestWarriorRankStatMapRepository;
import com.pokemon.server.service.IConquestWarriorRankStatMapService;

@Service
public class ConquestWarriorRankStatMapServiceImpl implements IConquestWarriorRankStatMapService {
	@Autowired
	IConquestWarriorRankStatMapRepository repository;

	@Override
	public ConquestWarriorRankStatMap findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestWarriorRankStatMap> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestWarriorRankStatMap save(ConquestWarriorRankStatMap entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestWarriorRankStatMap entity) {
		// TODO Auto-generated method stub
		return false;
	}
}