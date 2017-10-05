package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.VersionGroupPokemonMoveMethod;

public interface IVersionGroupPokemonMoveMethodRepository
		extends JpaRepository<VersionGroupPokemonMoveMethod, Integer> {
}