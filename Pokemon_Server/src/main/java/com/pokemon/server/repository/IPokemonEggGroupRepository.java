package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonEggGroup;

public interface IPokemonEggGroupRepository extends JpaRepository<PokemonEggGroup, Integer> {
}