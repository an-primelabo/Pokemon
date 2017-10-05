package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.SuperContestEffect;

public interface ISuperContestEffectRepository extends JpaRepository<SuperContestEffect, Integer> {
}