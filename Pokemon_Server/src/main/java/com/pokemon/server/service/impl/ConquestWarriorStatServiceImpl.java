package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestWarriorStat;
import com.pokemon.server.repository.IConquestWarriorStatRepository;
import com.pokemon.server.service.IConquestWarriorStatService;

@Service
public class ConquestWarriorStatServiceImpl implements IConquestWarriorStatService {
	@Autowired
	IConquestWarriorStatRepository repository;

	@Override
	public ConquestWarriorStat findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestWarriorStat> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestWarriorStat save(ConquestWarriorStat entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestWarriorStat entity) {
		// TODO Auto-generated method stub
		return false;
	}
}