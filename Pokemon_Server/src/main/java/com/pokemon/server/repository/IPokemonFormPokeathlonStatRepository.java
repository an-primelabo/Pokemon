package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonFormPokeathlonStat;

public interface IPokemonFormPokeathlonStatRepository extends JpaRepository<PokemonFormPokeathlonStat, Integer> {
}