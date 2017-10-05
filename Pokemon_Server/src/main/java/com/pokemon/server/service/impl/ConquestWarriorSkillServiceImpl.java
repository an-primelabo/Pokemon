package com.pokemon.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.server.entity.ConquestWarriorSkill;
import com.pokemon.server.repository.IConquestWarriorSkillRepository;
import com.pokemon.server.service.IConquestWarriorSkillService;

@Service
public class ConquestWarriorSkillServiceImpl implements IConquestWarriorSkillService {
	@Autowired
	IConquestWarriorSkillRepository repository;

	@Override
	public ConquestWarriorSkill findById(Serializable id) {
		return repository.findOne((Integer) id);
	}

	@Override
	public List<ConquestWarriorSkill> getAll() {
		return repository.findAll();
	}

	@Override
	public ConquestWarriorSkill save(ConquestWarriorSkill entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Serializable id) {
		repository.delete((Integer) id);
	}

	@Override
	public boolean isExists(ConquestWarriorSkill entity) {
		// TODO Auto-generated method stub
		return false;
	}
}