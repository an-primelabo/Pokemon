package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestMoveDisplacement;

public interface IConquestMoveDisplacementRepository extends JpaRepository<ConquestMoveDisplacement, Integer> {
}