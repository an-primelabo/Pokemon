package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Encounter;

public interface IEncounterRepository extends JpaRepository<Encounter, Integer> {
}