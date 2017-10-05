package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Item;
import com.pokemon.server.repository.IItemRepository;
import com.pokemon.server.service.IItemService;

@Service
public class ItemServiceImpl implements IItemService {
	@Autowired
	IItemRepository repository;

	@Override
	public Item findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Item> getAll() {
		return repository.findAll();
	}

	@Override
	public Item save(Item entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Item entity) {
		// TODO Auto-generated method stub
		return false;
	}
}