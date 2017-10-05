package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokeathlonStat;

public interface IPokeathlonStatRepository extends JpaRepository<PokeathlonStat, Integer> {
}