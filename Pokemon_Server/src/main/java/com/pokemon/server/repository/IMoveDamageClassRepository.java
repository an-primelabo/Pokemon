package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveDamageClass;

public interface IMoveDamageClassRepository extends JpaRepository<MoveDamageClass, Integer> {
}