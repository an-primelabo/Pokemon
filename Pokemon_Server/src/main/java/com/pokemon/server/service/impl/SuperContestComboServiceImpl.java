package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.SuperContestCombo;
import com.pokemon.server.repository.ISuperContestComboRepository;
import com.pokemon.server.service.ISuperContestComboService;

@Service
public class SuperContestComboServiceImpl implements ISuperContestComboService {
	@Autowired
	ISuperContestComboRepository repository;

	@Override
	public SuperContestCombo findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<SuperContestCombo> getAll() {
		return repository.findAll();
	}

	@Override
	public SuperContestCombo save(SuperContestCombo entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(SuperContestCombo entity) {
		// TODO Auto-generated method stub
		return false;
	}
}