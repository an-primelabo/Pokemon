package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ContestCombo;

public interface IContestComboRepository extends JpaRepository<ContestCombo, Integer> {
}