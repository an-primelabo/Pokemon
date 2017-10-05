package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestTransformationWarrior;

public interface IConquestTransformationWarriorRepository
		extends JpaRepository<ConquestTransformationWarrior, Integer> {
}