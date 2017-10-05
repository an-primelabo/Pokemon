package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.VersionGroupRegion;

public interface IVersionGroupRegionRepository extends JpaRepository<VersionGroupRegion, Integer> {
}