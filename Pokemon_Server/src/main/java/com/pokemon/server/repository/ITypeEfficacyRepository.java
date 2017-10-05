package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.TypeEfficacy;

public interface ITypeEfficacyRepository extends JpaRepository<TypeEfficacy, Integer> {
}