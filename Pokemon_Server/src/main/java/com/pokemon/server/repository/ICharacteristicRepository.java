package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Characteristic;

public interface ICharacteristicRepository extends JpaRepository<Characteristic, Integer> {
}