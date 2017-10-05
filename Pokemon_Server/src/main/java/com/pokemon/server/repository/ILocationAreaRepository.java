package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.LocationArea;

public interface ILocationAreaRepository extends JpaRepository<LocationArea, Integer> {
}