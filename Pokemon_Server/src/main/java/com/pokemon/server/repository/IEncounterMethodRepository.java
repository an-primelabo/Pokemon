package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.EncounterMethod;

public interface IEncounterMethodRepository extends JpaRepository<EncounterMethod, Integer> {
}