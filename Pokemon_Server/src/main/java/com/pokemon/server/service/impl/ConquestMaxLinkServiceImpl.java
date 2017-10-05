package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestMaxLink;
import com.pokemon.server.repository.IConquestMaxLinkRepository;
import com.pokemon.server.service.IConquestMaxLinkService;

@Service
public class ConquestMaxLinkServiceImpl implements IConquestMaxLinkService {
	@Autowired
	IConquestMaxLinkRepository repository;

	@Override
	public ConquestMaxLink findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestMaxLink> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestMaxLink save(ConquestMaxLink entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestMaxLink entity) {
		// TODO Auto-generated method stub
		return false;
	}
}