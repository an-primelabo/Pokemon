package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveMetaCategory;
import com.pokemon.server.repository.IMoveMetaCategoryRepository;
import com.pokemon.server.service.IMoveMetaCategoryService;

@Service
public class MoveMetaCategoryServiceImpl implements IMoveMetaCategoryService {
	@Autowired
	IMoveMetaCategoryRepository repository;

	@Override
	public MoveMetaCategory findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveMetaCategory> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveMetaCategory save(MoveMetaCategory entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveMetaCategory entity) {
		// TODO Auto-generated method stub
		return false;
	}
}