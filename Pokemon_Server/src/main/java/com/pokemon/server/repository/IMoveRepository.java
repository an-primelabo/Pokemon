package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Move;

public interface IMoveRepository extends JpaRepository<Move, Integer> {
}