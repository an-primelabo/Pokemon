package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ItemGameIndices;
import com.pokemon.server.repository.IItemGameIndicesRepository;
import com.pokemon.server.service.IItemGameIndicesService;

@Service
public class ItemGameIndicesServiceImpl implements IItemGameIndicesService {
	@Autowired
	IItemGameIndicesRepository repository;

	@Override
	public ItemGameIndices findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ItemGameIndices> getAll() {
		return repository.findAll();
	}

	@Override
	public ItemGameIndices save(ItemGameIndices entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ItemGameIndices entity) {
		// TODO Auto-generated method stub
		return false;
	}
}