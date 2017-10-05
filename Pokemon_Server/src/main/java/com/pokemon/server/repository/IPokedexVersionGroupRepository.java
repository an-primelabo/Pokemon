package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokedexVersionGroup;

public interface IPokedexVersionGroupRepository extends JpaRepository<PokedexVersionGroup, Integer> {
}