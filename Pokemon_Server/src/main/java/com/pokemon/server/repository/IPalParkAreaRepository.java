package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PalParkArea;

public interface IPalParkAreaRepository extends JpaRepository<PalParkArea, Integer> {
}