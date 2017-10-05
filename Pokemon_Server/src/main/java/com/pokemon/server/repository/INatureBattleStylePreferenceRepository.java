package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.NatureBattleStylePreference;

public interface INatureBattleStylePreferenceRepository extends JpaRepository<NatureBattleStylePreference, Integer> {
}