package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.Machine;
import com.pokemon.server.repository.IMachineRepository;
import com.pokemon.server.service.IMachineService;

@Service
public class MachineServiceImpl implements IMachineService {
	@Autowired
	IMachineRepository repository;

	@Override
	public Machine findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<Machine> getAll() {
		return repository.findAll();
	}

	@Override
	public Machine save(Machine entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(Machine entity) {
		// TODO Auto-generated method stub
		return false;
	}
}