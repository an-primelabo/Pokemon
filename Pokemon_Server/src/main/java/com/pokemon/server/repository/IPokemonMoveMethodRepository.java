package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonMoveMethod;

public interface IPokemonMoveMethodRepository extends JpaRepository<PokemonMoveMethod, Integer> {
}