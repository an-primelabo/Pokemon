package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestTransformationPokemon;

public interface IConquestTransformationPokemonRepository
		extends JpaRepository<ConquestTransformationPokemon, Integer> {
}