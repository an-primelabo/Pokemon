package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveFlag;

public interface IMoveFlagRepository extends JpaRepository<MoveFlag, Integer> {
}