package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonEvolution;

public interface IPokemonEvolutionRepository extends JpaRepository<PokemonEvolution, Integer> {
}