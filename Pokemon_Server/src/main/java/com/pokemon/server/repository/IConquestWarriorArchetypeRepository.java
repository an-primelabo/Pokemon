package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestWarriorArchetype;

public interface IConquestWarriorArchetypeRepository extends JpaRepository<ConquestWarriorArchetype, Integer> {
}