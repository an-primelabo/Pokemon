package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestWarriorRankStatMap;

public interface IConquestWarriorRankStatMapRepository extends JpaRepository<ConquestWarriorRankStatMap, Integer> {
}