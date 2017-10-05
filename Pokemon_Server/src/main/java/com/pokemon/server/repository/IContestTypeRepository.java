package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ContestType;

public interface IContestTypeRepository extends JpaRepository<ContestType, Integer> {
}