package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestPokemonMove;

public interface IConquestPokemonMoveRepository extends JpaRepository<ConquestPokemonMove, Integer> {
}