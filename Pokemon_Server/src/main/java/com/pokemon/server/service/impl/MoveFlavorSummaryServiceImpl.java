package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveFlavorSummary;
import com.pokemon.server.repository.IMoveFlavorSummaryRepository;
import com.pokemon.server.service.IMoveFlavorSummaryService;

@Service
public class MoveFlavorSummaryServiceImpl implements IMoveFlavorSummaryService {
	@Autowired
	IMoveFlavorSummaryRepository repository;

	@Override
	public MoveFlavorSummary findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveFlavorSummary> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveFlavorSummary save(MoveFlavorSummary entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveFlavorSummary entity) {
		// TODO Auto-generated method stub
		return false;
	}
}