package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveTarget;

public interface IMoveTargetRepository extends JpaRepository<MoveTarget, Integer> {
}