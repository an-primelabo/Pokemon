package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Experience;

public interface IExperienceRepository extends JpaRepository<Experience, Integer> {
}