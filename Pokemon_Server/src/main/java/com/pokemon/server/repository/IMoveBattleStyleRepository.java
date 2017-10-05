package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveBattleStyle;

public interface IMoveBattleStyleRepository extends JpaRepository<MoveBattleStyle, Integer> {
}