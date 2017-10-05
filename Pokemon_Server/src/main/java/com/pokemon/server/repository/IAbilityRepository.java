package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Ability;

public interface IAbilityRepository extends JpaRepository<Ability, Integer> {
}