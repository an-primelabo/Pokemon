package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonColor;

public interface IPokemonColorRepository extends JpaRepository<PokemonColor, Integer> {
}