package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Gender;

public interface IGenderRepository extends JpaRepository<Gender, Integer> {
}