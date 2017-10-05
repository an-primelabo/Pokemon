package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonHabitat;

public interface IPokemonHabitatRepository extends JpaRepository<PokemonHabitat, Integer> {
}