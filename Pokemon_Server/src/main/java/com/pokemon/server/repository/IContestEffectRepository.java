package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ContestEffect;

public interface IContestEffectRepository extends JpaRepository<ContestEffect, Integer> {
}