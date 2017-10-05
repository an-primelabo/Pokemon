package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Generation;

public interface IGenerationRepository extends JpaRepository<Generation, Integer> {
}