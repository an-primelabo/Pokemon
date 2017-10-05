package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ItemFlavorText;

public interface IItemFlavorTextRepository extends JpaRepository<ItemFlavorText, Integer> {
}