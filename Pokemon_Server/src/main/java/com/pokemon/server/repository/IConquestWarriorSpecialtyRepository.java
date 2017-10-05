package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestWarriorSpecialty;

public interface IConquestWarriorSpecialtyRepository extends JpaRepository<ConquestWarriorSpecialty, Integer> {
}