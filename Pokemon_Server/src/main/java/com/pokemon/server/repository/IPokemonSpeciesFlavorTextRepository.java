package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonSpeciesFlavorText;

public interface IPokemonSpeciesFlavorTextRepository extends JpaRepository<PokemonSpeciesFlavorText, Integer> {
}