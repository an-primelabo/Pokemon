package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestPokemonAbility;

public interface IConquestPokemonAbilityRepository extends JpaRepository<ConquestPokemonAbility, Integer> {
}