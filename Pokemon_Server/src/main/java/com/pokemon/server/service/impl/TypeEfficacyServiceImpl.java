package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.TypeEfficacy;
import com.pokemon.server.repository.ITypeEfficacyRepository;
import com.pokemon.server.service.ITypeEfficacyService;

@Service
public class TypeEfficacyServiceImpl implements ITypeEfficacyService {
	@Autowired
	ITypeEfficacyRepository repository;

	@Override
	public TypeEfficacy findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<TypeEfficacy> getAll() {
		return repository.findAll();
	}

	@Override
	public TypeEfficacy save(TypeEfficacy entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(TypeEfficacy entity) {
		// TODO Auto-generated method stub
		return false;
	}
}