package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveMeta;
import com.pokemon.server.repository.IMoveMetaRepository;
import com.pokemon.server.service.IMoveMetaService;

@Service
public class MoveMetaServiceImpl implements IMoveMetaService {
	@Autowired
	IMoveMetaRepository repository;

	@Override
	public MoveMeta findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveMeta> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveMeta save(MoveMeta entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveMeta entity) {
		// TODO Auto-generated method stub
		return false;
	}
}