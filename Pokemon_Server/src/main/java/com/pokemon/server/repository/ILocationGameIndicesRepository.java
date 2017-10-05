package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.LocationGameIndices;

public interface ILocationGameIndicesRepository extends JpaRepository<LocationGameIndices, Integer> {
}