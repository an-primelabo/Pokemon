package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestStat;

public interface IConquestStatRepository extends JpaRepository<ConquestStat, Integer> {
}