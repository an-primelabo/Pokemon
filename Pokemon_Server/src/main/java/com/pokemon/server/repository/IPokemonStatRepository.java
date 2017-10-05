package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonStat;

public interface IPokemonStatRepository extends JpaRepository<PokemonStat, Integer> {
}