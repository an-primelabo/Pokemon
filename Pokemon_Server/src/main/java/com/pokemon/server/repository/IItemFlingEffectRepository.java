package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ItemFlingEffect;

public interface IItemFlingEffectRepository extends JpaRepository<ItemFlingEffect, Integer> {
}