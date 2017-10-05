package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveEffectChangelog;

public interface IMoveEffectChangelogRepository extends JpaRepository<MoveEffectChangelog, Integer> {
}