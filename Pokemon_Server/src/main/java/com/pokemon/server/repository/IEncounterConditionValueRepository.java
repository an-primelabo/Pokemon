package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.EncounterConditionValue;

public interface IEncounterConditionValueRepository extends JpaRepository<EncounterConditionValue, Integer> {
}