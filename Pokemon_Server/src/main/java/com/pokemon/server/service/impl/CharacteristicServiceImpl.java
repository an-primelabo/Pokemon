package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Characteristic;
import com.pokemon.server.repository.ICharacteristicRepository;
import com.pokemon.server.service.ICharacteristicService;

@Service
public class CharacteristicServiceImpl implements ICharacteristicService {
	@Autowired
	ICharacteristicRepository repository;

	@Override
	public Characteristic findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Characteristic> getAll() {
		return repository.findAll();
	}

	@Override
	public Characteristic save(Characteristic entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Characteristic entity) {
		// TODO Auto-generated method stub
		return false;
	}
}