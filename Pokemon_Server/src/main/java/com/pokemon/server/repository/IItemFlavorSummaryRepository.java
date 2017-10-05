package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ItemFlavorSummary;

public interface IItemFlavorSummaryRepository extends JpaRepository<ItemFlavorSummary, Integer> {
}