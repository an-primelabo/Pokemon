package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.EncounterSlot;
import com.pokemon.server.repository.IEncounterSlotRepository;
import com.pokemon.server.service.IEncounterSlotService;

@Service
public class EncounterSlotServiceImpl implements IEncounterSlotService {
	@Autowired
	IEncounterSlotRepository repository;

	@Override
	public EncounterSlot findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<EncounterSlot> getAll() {
		return repository.findAll();
	}

	@Override
	public EncounterSlot save(EncounterSlot entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(EncounterSlot entity) {
		// TODO Auto-generated method stub
		return false;
	}
}