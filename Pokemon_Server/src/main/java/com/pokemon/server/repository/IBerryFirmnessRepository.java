package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.BerryFirmness;

public interface IBerryFirmnessRepository extends JpaRepository<BerryFirmness, Integer> {
}