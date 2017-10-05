package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_species_flavor_summaries")
public class PokemonSpeciesFlavorSummary implements Serializable {
	private static final long serialVersionUID = 2684498956311657276L;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "flavor_summary")
	private String flavorSummary;

	public PokemonSpeciesFlavorSummary() {
	}

	public PokemonSpeciesFlavorSummary(Integer pokemonSpeciesId, String flavorSummary) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.flavorSummary = flavorSummary;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public String getFlavorSummary() {
		return flavorSummary;
	}

	public void setFlavorSummary(String flavorSummary) {
		this.flavorSummary = flavorSummary;
	}

	@Override
	public String toString() {
		return "PokemonSpeciesFlavorSummary [pokemonSpeciesId=" + pokemonSpeciesId + ", flavorSummary=" + flavorSummary
				+ "]";
	}
}