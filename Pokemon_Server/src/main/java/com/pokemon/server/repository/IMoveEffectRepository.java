package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveEffect;

public interface IMoveEffectRepository extends JpaRepository<MoveEffect, Integer> {
}