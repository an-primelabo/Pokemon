package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.MoveFlavorText;
import com.pokemon.server.repository.IMoveFlavorTextRepository;
import com.pokemon.server.service.IMoveFlavorTextService;

@Service
public class MoveFlavorTextServiceImpl implements IMoveFlavorTextService {
	@Autowired
	IMoveFlavorTextRepository repository;

	@Override
	public MoveFlavorText findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<MoveFlavorText> getAll() {
		return repository.findAll();
	}

	@Override
	public MoveFlavorText save(MoveFlavorText entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(MoveFlavorText entity) {
		// TODO Auto-generated method stub
		return false;
	}
}