package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.PalParkArea;
import com.pokemon.server.repository.IPalParkAreaRepository;
import com.pokemon.server.service.IPalParkAreaService;

@Service
public class PalParkAreaServiceImpl implements IPalParkAreaService {
	@Autowired
	IPalParkAreaRepository repository;

	@Override
	public PalParkArea findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<PalParkArea> getAll() {
		return repository.findAll();
	}

	@Override
	public PalParkArea save(PalParkArea entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(PalParkArea entity) {
		// TODO Auto-generated method stub
		return false;
	}
}