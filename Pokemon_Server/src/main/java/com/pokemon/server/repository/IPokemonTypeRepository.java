package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonType;

public interface IPokemonTypeRepository extends JpaRepository<PokemonType, Integer> {
}