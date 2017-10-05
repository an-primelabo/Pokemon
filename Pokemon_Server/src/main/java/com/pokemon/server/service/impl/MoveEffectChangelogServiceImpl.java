package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveEffectChangelog;
import com.pokemon.server.repository.IMoveEffectChangelogRepository;
import com.pokemon.server.service.IMoveEffectChangelogService;

@Service
public class MoveEffectChangelogServiceImpl implements IMoveEffectChangelogService {
	@Autowired
	IMoveEffectChangelogRepository repository;

	@Override
	public MoveEffectChangelog findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveEffectChangelog> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveEffectChangelog save(MoveEffectChangelog entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveEffectChangelog entity) {
		// TODO Auto-generated method stub
		return false;
	}
}