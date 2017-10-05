package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveMeta;

public interface IMoveMetaRepository extends JpaRepository<MoveMeta, Integer> {
}