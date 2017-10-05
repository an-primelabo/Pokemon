package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestWarriorSkill;

public interface IConquestWarriorSkillRepository extends JpaRepository<ConquestWarriorSkill, Integer> {
}