package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Stat;

public interface IStatRepository extends JpaRepository<Stat, Integer> {
}