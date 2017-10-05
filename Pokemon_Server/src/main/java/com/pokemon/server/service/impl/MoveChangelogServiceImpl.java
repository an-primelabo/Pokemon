package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveChangelog;
import com.pokemon.server.repository.IMoveChangelogRepository;
import com.pokemon.server.service.IMoveChangelogService;

@Service
public class MoveChangelogServiceImpl implements IMoveChangelogService {
	@Autowired
	IMoveChangelogRepository repository;

	@Override
	public MoveChangelog findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveChangelog> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveChangelog save(MoveChangelog entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveChangelog entity) {
		// TODO Auto-generated method stub
		return false;
	}
}