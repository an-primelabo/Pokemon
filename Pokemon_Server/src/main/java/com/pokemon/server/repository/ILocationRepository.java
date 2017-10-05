package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Location;

public interface ILocationRepository extends JpaRepository<Location, Integer> {
}