package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.VersionGroup;
import com.pokemon.server.repository.IVersionGroupRepository;
import com.pokemon.server.service.IVersionGroupService;

@Service
public class VersionGroupServiceImpl implements IVersionGroupService {
	@Autowired
	IVersionGroupRepository repository;

	@Override
	public VersionGroup findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<VersionGroup> getAll() {
		return repository.findAll();
	}

	@Override
	public VersionGroup save(VersionGroup entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(VersionGroup entity) {
		// TODO Auto-generated method stub
		return false;
	}
}