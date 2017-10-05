package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Type;

public interface ITypeRepository extends JpaRepository<Type, Integer> {
}