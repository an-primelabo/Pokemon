package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestWarriorTransformation;

public interface IConquestWarriorTransformationRepository
		extends JpaRepository<ConquestWarriorTransformation, Integer> {
}