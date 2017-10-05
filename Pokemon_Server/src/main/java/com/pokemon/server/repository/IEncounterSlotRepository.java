package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.EncounterSlot;

public interface IEncounterSlotRepository extends JpaRepository<EncounterSlot, Integer> {
}