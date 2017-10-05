package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestPokemonEvolution;

public interface IConquestPokemonEvolutionRepository extends JpaRepository<ConquestPokemonEvolution, Integer> {
}