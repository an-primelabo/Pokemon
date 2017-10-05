package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestWarriorRank;
import com.pokemon.server.repository.IConquestWarriorRankRepository;
import com.pokemon.server.service.IConquestWarriorRankService;

@Service
public class ConquestWarriorRankServiceImpl implements IConquestWarriorRankService {
	@Autowired
	IConquestWarriorRankRepository repository;

	@Override
	public ConquestWarriorRank findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestWarriorRank> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestWarriorRank save(ConquestWarriorRank entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestWarriorRank entity) {
		// TODO Auto-generated method stub
		return false;
	}
}