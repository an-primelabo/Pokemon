package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestKingdom;

public interface IConquestKingdomRepository extends JpaRepository<ConquestKingdom, Integer> {
}