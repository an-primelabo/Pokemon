package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ItemCategory;
import com.pokemon.server.repository.IItemCategoryRepository;
import com.pokemon.server.service.IItemCategoryService;

@Service
public class ItemCategoryServiceImpl implements IItemCategoryService {
	@Autowired
	IItemCategoryRepository repository;

	@Override
	public ItemCategory findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ItemCategory> getAll() {
		return repository.findAll();
	}

	@Override
	public ItemCategory save(ItemCategory entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ItemCategory entity) {
		// TODO Auto-generated method stub
		return false;
	}
}