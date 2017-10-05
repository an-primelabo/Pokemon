package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonMove;

public interface IPokemonMoveRepository extends JpaRepository<PokemonMove, Integer> {
}