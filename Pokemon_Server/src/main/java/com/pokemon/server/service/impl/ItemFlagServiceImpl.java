package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ItemFlag;
import com.pokemon.server.repository.IItemFlagRepository;
import com.pokemon.server.service.IItemFlagService;

@Service
public class ItemFlagServiceImpl implements IItemFlagService {
	@Autowired
	IItemFlagRepository repository;

	@Override
	public ItemFlag findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ItemFlag> getAll() {
		return repository.findAll();
	}

	@Override
	public ItemFlag save(ItemFlag entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ItemFlag entity) {
		// TODO Auto-generated method stub
		return false;
	}
}