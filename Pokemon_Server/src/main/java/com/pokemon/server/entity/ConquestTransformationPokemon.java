package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_transformation_pokemon")
public class ConquestTransformationPokemon implements Serializable {
	private static final long serialVersionUID = -8195825876605638407L;

	@Column(name = "conquest_transformation_pokemon_id")
	private Integer conquestTransformationPokemonId;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	public ConquestTransformationPokemon() {
	}

	public ConquestTransformationPokemon(Integer conquestTransformationPokemonId, Integer pokemonSpeciesId) {
		this.conquestTransformationPokemonId = conquestTransformationPokemonId;
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getConquestTransformationPokemonId() {
		return conquestTransformationPokemonId;
	}

	public void setConquestTransformationPokemonId(Integer conquestTransformationPokemonId) {
		this.conquestTransformationPokemonId = conquestTransformationPokemonId;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	@Override
	public String toString() {
		return "ConquestTransformationPokemon [conquestTransformationPokemonId=" + conquestTransformationPokemonId
				+ ", pokemonSpeciesId=" + pokemonSpeciesId + "]";
	}
}