package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonForm;

public interface IPokemonFormRepository extends JpaRepository<PokemonForm, Integer> {
}