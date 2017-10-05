package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestWarrior;

public interface IConquestWarriorRepository extends JpaRepository<ConquestWarrior, Integer> {
}