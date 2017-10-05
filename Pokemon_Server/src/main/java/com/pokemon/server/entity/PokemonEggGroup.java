package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_egg_groups")
public class PokemonEggGroup implements Serializable {
	private static final long serialVersionUID = 1659796825138125880L;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "egg_group_id")
	private Integer eggGroupId;

	public PokemonEggGroup() {
	}

	public PokemonEggGroup(Integer pokemonSpeciesId, Integer eggGroupId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.eggGroupId = eggGroupId;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getEggGroupId() {
		return eggGroupId;
	}

	public void setEggGroupId(Integer eggGroupId) {
		this.eggGroupId = eggGroupId;
	}

	@Override
	public String toString() {
		return "PokemonEggGroup [pokemonSpeciesId=" + pokemonSpeciesId + ", eggGroupId=" + eggGroupId + "]";
	}
}