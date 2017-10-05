package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Version;
import com.pokemon.server.repository.IVersionRepository;
import com.pokemon.server.service.IVersionService;

@Service
public class VersionServiceImpl implements IVersionService {
	@Autowired
	IVersionRepository repository;

	@Override
	public Version findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Version> getAll() {
		return repository.findAll();
	}

	@Override
	public Version save(Version entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Version entity) {
		// TODO Auto-generated method stub
		return false;
	}
}