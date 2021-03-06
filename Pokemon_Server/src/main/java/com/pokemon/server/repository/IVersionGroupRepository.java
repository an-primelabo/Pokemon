package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.VersionGroup;

public interface IVersionGroupRepository extends JpaRepository<VersionGroup, Integer> {
}