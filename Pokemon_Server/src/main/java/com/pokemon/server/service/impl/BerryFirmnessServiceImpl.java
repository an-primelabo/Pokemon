package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.BerryFirmness;
import com.pokemon.server.repository.IBerryFirmnessRepository;
import com.pokemon.server.service.IBerryFirmnessService;

@Service
public class BerryFirmnessServiceImpl implements IBerryFirmnessService {
	@Autowired
	IBerryFirmnessRepository repository;

	@Override
	public BerryFirmness findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<BerryFirmness> getAll() {
		return repository.findAll();
	}

	@Override
	public BerryFirmness save(BerryFirmness entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(BerryFirmness entity) {
		// TODO Auto-generated method stub
		return false;
	}
}