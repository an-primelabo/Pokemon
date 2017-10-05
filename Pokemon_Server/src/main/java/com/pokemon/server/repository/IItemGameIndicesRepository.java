package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.ItemGameIndices;

public interface IItemGameIndicesRepository extends JpaRepository<ItemGameIndices, Integer> {
}