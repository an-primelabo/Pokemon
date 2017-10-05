package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PalPark;
import com.pokemon.server.repository.IPalParkRepository;
import com.pokemon.server.service.IPalParkService;

@Service
public class PalParkServiceImpl implements IPalParkService {
	@Autowired
	IPalParkRepository repository;

	@Override
	public PalPark findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PalPark> getAll() {
		return repository.findAll();
	}

	@Override
	public PalPark save(PalPark entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PalPark entity) {
		// TODO Auto-generated method stub
		return false;
	}
}