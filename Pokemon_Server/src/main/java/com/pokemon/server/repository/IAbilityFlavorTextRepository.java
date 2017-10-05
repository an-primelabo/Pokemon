package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.AbilityFlavorText;

public interface IAbilityFlavorTextRepository extends JpaRepository<AbilityFlavorText, Integer> {
}