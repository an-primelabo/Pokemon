package com.pokemon.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.server.entity.Machine;

public interface IMachineRepository extends JpaRepository<Machine, Integer> {
}