package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveMetaAilment;

public interface IMoveMetaAilmentRepository extends JpaRepository<MoveMetaAilment, Integer> {
}