package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Nature;

public interface INatureRepository extends JpaRepository<Nature, Integer> {
}