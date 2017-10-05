package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonFormGeneration;

public interface IPokemonFormGenerationRepository extends JpaRepository<PokemonFormGeneration, Integer> {
}