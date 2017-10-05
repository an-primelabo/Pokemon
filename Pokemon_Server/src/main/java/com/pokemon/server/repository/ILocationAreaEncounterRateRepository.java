package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.LocationAreaEncounterRate;

public interface ILocationAreaEncounterRateRepository extends JpaRepository<LocationAreaEncounterRate, Integer> {
}