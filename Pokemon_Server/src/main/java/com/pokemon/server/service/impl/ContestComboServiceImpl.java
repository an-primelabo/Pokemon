package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ContestCombo;
import com.pokemon.server.repository.IContestComboRepository;
import com.pokemon.server.service.IContestComboService;

@Service
public class ContestComboServiceImpl implements IContestComboService {
	@Autowired
	IContestComboRepository repository;

	@Override
	public ContestCombo findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ContestCombo> getAll() {
		return repository.findAll();
	}

	@Override
	public ContestCombo save(ContestCombo entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ContestCombo entity) {
		// TODO Auto-generated method stub
		return false;
	}
}