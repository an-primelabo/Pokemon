package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveDamageClass;
import com.pokemon.server.repository.IMoveDamageClassRepository;
import com.pokemon.server.service.IMoveDamageClassService;

@Service
public class MoveDamageClassServiceImpl implements IMoveDamageClassService {
	@Autowired
	IMoveDamageClassRepository repository;

	@Override
	public MoveDamageClass findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveDamageClass> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveDamageClass save(MoveDamageClass entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveDamageClass entity) {
		// TODO Auto-generated method stub
		return false;
	}
}