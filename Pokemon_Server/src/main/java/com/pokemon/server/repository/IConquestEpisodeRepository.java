package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ConquestEpisode;

public interface IConquestEpisodeRepository extends JpaRepository<ConquestEpisode, Integer> {
}