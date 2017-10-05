package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Type;
import com.pokemon.server.repository.ITypeRepository;
import com.pokemon.server.service.ITypeService;

@Service
public class TypeServiceImpl implements ITypeService {
	@Autowired
	ITypeRepository repository;

	@Override
	public Type findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Type> getAll() {
		return repository.findAll();
	}

	@Override
	public Type save(Type entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Type entity) {
		// TODO Auto-generated method stub
		return false;
	}
}