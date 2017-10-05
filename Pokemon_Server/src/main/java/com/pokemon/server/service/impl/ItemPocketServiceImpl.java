package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ItemPocket;
import com.pokemon.server.repository.IItemPocketRepository;
import com.pokemon.server.service.IItemPocketService;

@Service
public class ItemPocketServiceImpl implements IItemPocketService {
	@Autowired
	IItemPocketRepository repository;

	@Override
	public ItemPocket findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ItemPocket> getAll() {
		return repository.findAll();
	}

	@Override
	public ItemPocket save(ItemPocket entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ItemPocket entity) {
		// TODO Auto-generated method stub
		return false;
	}
}