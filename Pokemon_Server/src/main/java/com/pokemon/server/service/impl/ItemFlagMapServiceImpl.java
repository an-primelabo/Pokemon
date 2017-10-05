package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ItemFlagMap;
import com.pokemon.server.repository.IItemFlagMapRepository;
import com.pokemon.server.service.IItemFlagMapService;

@Service
public class ItemFlagMapServiceImpl implements IItemFlagMapService {
	@Autowired
	IItemFlagMapRepository repository;

	@Override
	public ItemFlagMap findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ItemFlagMap> getAll() {
		return repository.findAll();
	}

	@Override
	public ItemFlagMap save(ItemFlagMap entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ItemFlagMap entity) {
		// TODO Auto-generated method stub
		return false;
	}
}