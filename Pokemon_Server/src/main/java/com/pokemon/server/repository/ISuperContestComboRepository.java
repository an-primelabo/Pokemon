package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.SuperContestCombo;

public interface ISuperContestComboRepository extends JpaRepository<SuperContestCombo, Integer> {
}