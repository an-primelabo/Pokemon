package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestMoveEffect;

public interface IConquestMoveEffectRepository extends JpaRepository<ConquestMoveEffect, Integer> {
}