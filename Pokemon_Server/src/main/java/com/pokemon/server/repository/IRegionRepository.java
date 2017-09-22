package com.pokemon.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.server.entity.Region;

@Repository
public interface IRegionRepository extends JpaRepository<Region, Integer> {
	List<Region> findByNameLike(String name);

	Region findByNameAndNameAlias(String name, String nameAlias);
}