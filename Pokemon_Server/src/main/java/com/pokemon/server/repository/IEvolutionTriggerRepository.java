package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.EvolutionTrigger;

public interface IEvolutionTriggerRepository extends JpaRepository<EvolutionTrigger, Integer> {
}