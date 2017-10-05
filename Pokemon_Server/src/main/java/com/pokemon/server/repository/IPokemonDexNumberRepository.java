package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.PokemonDexNumber;

public interface IPokemonDexNumberRepository extends JpaRepository<PokemonDexNumber, Integer> {
}