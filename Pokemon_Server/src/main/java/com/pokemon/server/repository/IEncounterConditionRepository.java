package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.EncounterCondition;

public interface IEncounterConditionRepository extends JpaRepository<EncounterCondition, Integer> {
}