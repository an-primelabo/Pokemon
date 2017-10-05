package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Berry;

public interface IBerryRepository extends JpaRepository<Berry, Integer> {
}