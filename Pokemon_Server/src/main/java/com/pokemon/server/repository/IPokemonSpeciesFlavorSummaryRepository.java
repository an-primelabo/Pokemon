package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonSpeciesFlavorSummary;

public interface IPokemonSpeciesFlavorSummaryRepository extends JpaRepository<PokemonSpeciesFlavorSummary, Integer> {
}