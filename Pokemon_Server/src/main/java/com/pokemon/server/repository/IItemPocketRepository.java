package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ItemPocket;

public interface IItemPocketRepository extends JpaRepository<ItemPocket, Integer> {
}