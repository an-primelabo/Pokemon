package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestMaxLink;

public interface IConquestMaxLinkRepository extends JpaRepository<ConquestMaxLink, Integer> {
}