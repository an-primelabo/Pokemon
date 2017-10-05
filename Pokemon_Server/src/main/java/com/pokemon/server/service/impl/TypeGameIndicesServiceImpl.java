package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.TypeGameIndices;
import com.pokemon.server.repository.ITypeGameIndicesRepository;
import com.pokemon.server.service.ITypeGameIndicesService;

@Service
public class TypeGameIndicesServiceImpl implements ITypeGameIndicesService {
	@Autowired
	ITypeGameIndicesRepository repository;

	@Override
	public TypeGameIndices findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<TypeGameIndices> getAll() {
		return repository.findAll();
	}

	@Override
	public TypeGameIndices save(TypeGameIndices entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(TypeGameIndices entity) {
		// TODO Auto-generated method stub
		return false;
	}
}