package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveFlagMap;

public interface IMoveFlagMapRepository extends JpaRepository<MoveFlagMap, Integer> {
}