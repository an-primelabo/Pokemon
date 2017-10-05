package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ItemFlavorText;
import com.pokemon.server.repository.IItemFlavorTextRepository;
import com.pokemon.server.service.IItemFlavorTextService;

@Service
public class ItemFlavorTextServiceImpl implements IItemFlavorTextService {
	@Autowired
	IItemFlavorTextRepository repository;

	@Override
	public ItemFlavorText findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ItemFlavorText> getAll() {
		return repository.findAll();
	}

	@Override
	public ItemFlavorText save(ItemFlavorText entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ItemFlavorText entity) {
		// TODO Auto-generated method stub
		return false;
	}
}