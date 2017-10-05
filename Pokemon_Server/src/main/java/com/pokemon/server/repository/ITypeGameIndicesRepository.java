package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.TypeGameIndices;

public interface ITypeGameIndicesRepository extends JpaRepository<TypeGameIndices, Integer> {
}