package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonGameIndices;

public interface IPokemonGameIndicesRepository extends JpaRepository<PokemonGameIndices, Integer> {
}