package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.BerryFlavor;
import com.pokemon.server.repository.IBerryFlavorRepository;
import com.pokemon.server.service.IBerryFlavorService;

@Service
public class BerryFlavorServiceImpl implements IBerryFlavorService {
	@Autowired
	IBerryFlavorRepository repository;

	@Override
	public BerryFlavor findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<BerryFlavor> getAll() {
		return repository.findAll();
	}

	@Override
	public BerryFlavor save(BerryFlavor entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(BerryFlavor entity) {
		// TODO Auto-generated method stub
		return false;
	}
}