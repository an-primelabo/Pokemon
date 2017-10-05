package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.EggGroup;

public interface IEggGroupRepository extends JpaRepository<EggGroup, Integer> {
}