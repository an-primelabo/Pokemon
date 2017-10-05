package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ItemFlagMap;

public interface IItemFlagMapRepository extends JpaRepository<ItemFlagMap, Integer> {
}