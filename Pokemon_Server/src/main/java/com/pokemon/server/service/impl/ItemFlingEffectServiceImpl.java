package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ItemFlingEffect;
import com.pokemon.server.repository.IItemFlingEffectRepository;
import com.pokemon.server.service.IItemFlingEffectService;

@Service
public class ItemFlingEffectServiceImpl implements IItemFlingEffectService {
	@Autowired
	IItemFlingEffectRepository repository;

	@Override
	public ItemFlingEffect findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ItemFlingEffect> getAll() {
		return repository.findAll();
	}

	@Override
	public ItemFlingEffect save(ItemFlingEffect entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ItemFlingEffect entity) {
		// TODO Auto-generated method stub
		return false;
	}
}