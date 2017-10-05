package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestPokemonStat;

public interface IConquestPokemonStatRepository extends JpaRepository<ConquestPokemonStat, Integer> {
}