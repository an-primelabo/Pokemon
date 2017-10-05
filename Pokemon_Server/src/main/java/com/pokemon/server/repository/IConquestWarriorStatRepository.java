package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestWarriorStat;

public interface IConquestWarriorStatRepository extends JpaRepository<ConquestWarriorStat, Integer> {
}