package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.AbilityFlavorText;
import com.pokemon.server.repository.IAbilityFlavorTextRepository;
import com.pokemon.server.service.IAbilityFlavorTextService;

@Service
public class AbilityFlavorTextServiceImpl implements IAbilityFlavorTextService {
	@Autowired
	IAbilityFlavorTextRepository repository;

	@Override
	public AbilityFlavorText findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<AbilityFlavorText> getAll() {
		return repository.findAll();
	}

	@Override
	public AbilityFlavorText save(AbilityFlavorText entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(AbilityFlavorText entity) {
		// TODO Auto-generated method stub
		return false;
	}
}