package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveMetaCategory;

public interface IMoveMetaCategoryRepository extends JpaRepository<MoveMetaCategory, Integer> {
}