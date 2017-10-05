package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestMoveData;

public interface IConquestMoveDataRepository extends JpaRepository<ConquestMoveData, Integer> {
}