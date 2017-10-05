package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestMoveRange;

public interface IConquestMoveRangeRepository extends JpaRepository<ConquestMoveRange, Integer> {
}