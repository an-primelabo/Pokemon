package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.MoveChangelog;

public interface IMoveChangelogRepository extends JpaRepository<MoveChangelog, Integer> {
}