package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.EncounterConditionValueMap;

public interface IEncounterConditionValueMapRepository extends JpaRepository<EncounterConditionValueMap, Integer> {
}