package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ItemCategory;

public interface IItemCategoryRepository extends JpaRepository<ItemCategory, Integer> {
}