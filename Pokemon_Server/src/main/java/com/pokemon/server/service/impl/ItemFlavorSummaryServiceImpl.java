package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ItemFlavorSummary;
import com.pokemon.server.repository.IItemFlavorSummaryRepository;
import com.pokemon.server.service.IItemFlavorSummaryService;

@Service
public class ItemFlavorSummaryServiceImpl implements IItemFlavorSummaryService {
	@Autowired
	IItemFlavorSummaryRepository repository;

	@Override
	public ItemFlavorSummary findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ItemFlavorSummary> getAll() {
		return repository.findAll();
	}

	@Override
	public ItemFlavorSummary save(ItemFlavorSummary entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ItemFlavorSummary entity) {
		// TODO Auto-generated method stub
		return false;
	}
}