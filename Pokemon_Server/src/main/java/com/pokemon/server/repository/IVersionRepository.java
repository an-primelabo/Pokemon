package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Version;

public interface IVersionRepository extends JpaRepository<Version, Integer> {
}