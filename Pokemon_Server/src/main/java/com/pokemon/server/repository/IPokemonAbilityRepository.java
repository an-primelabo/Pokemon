package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonAbility;

public interface IPokemonAbilityRepository extends JpaRepository<PokemonAbility, Integer> {
}