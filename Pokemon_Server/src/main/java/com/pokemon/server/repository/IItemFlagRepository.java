package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ItemFlag;

public interface IItemFlagRepository extends JpaRepository<ItemFlag, Integer> {
}