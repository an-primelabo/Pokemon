package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestEpisodeWarrior;
import com.pokemon.server.repository.IConquestEpisodeWarriorRepository;
import com.pokemon.server.service.IConquestEpisodeWarriorService;

@Service
public class ConquestEpisodeWarriorServiceImpl implements IConquestEpisodeWarriorService {
	@Autowired
	IConquestEpisodeWarriorRepository repository;

	@Override
	public ConquestEpisodeWarrior findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestEpisodeWarrior> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestEpisodeWarrior save(ConquestEpisodeWarrior entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestEpisodeWarrior entity) {
		// TODO Auto-generated method stub
		return false;
	}
}