package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.AbilityChangelog;

public interface IAbilityChangelogRepository extends JpaRepository<AbilityChangelog, Integer> {
}