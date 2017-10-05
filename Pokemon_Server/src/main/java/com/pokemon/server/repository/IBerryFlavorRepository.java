package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.BerryFlavor;

public interface IBerryFlavorRepository extends JpaRepository<BerryFlavor, Integer> {
}