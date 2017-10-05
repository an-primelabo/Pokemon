package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveMetaStatChange;

public interface IMoveMetaStatChangeRepository extends JpaRepository<MoveMetaStatChange, Integer> {
}