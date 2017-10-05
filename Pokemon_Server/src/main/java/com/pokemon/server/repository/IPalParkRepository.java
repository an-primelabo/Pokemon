package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PalPark;

public interface IPalParkRepository extends JpaRepository<PalPark, Integer> {
}