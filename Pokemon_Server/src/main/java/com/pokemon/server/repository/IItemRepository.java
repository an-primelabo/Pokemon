package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Item;

public interface IItemRepository extends JpaRepository<Item, Integer> {
}