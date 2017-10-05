package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveFlavorText;

public interface IMoveFlavorTextRepository extends JpaRepository<MoveFlavorText, Integer> {
}