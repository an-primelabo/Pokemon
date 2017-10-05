package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestWarriorRank;

public interface IConquestWarriorRankRepository extends JpaRepository<ConquestWarriorRank, Integer> {
}