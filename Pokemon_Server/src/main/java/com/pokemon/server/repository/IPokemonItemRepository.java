package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonItem;

public interface IPokemonItemRepository extends JpaRepository<PokemonItem, Integer> {
}