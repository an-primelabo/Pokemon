package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonShape;

public interface IPokemonShapeRepository extends JpaRepository<PokemonShape, Integer> {
}