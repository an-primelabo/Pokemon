package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.EvolutionChain;

public interface IEvolutionChainRepository extends JpaRepository<EvolutionChain, Integer> {
}