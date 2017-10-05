package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.NaturePokeathlonStat;
import com.pokemon.server.repository.INaturePokeathlonStatRepository;
import com.pokemon.server.service.INaturePokeathlonStatService;

@Service
public class NaturePokeathlonStatServiceImpl implements INaturePokeathlonStatService {
	@Autowired
	INaturePokeathlonStatRepository repository;

	@Override
	public NaturePokeathlonStat findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<NaturePokeathlonStat> getAll() {
		return repository.findAll();
	}

	@Override
	public NaturePokeathlonStat save(NaturePokeathlonStat entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(NaturePokeathlonStat entity) {
		// TODO Auto-generated method stub
		return false;
	}
}