package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonSpecies;

public interface IPokemonSpeciesRepository extends JpaRepository<PokemonSpecies, Integer> {
}