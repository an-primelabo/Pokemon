package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_species_flavor_text")
public class PokemonSpeciesFlavorText implements Serializable {
	private static final long serialVersionUID = 4898816471140660671L;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "version_id")
	private Integer versionId;

	@Column(name = "flavor_text")
	private String flavorText;

	public PokemonSpeciesFlavorText() {
	}

	public PokemonSpeciesFlavorText(Integer pokemonSpeciesId, Integer versionId, String flavorText) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.versionId = versionId;
		this.flavorText = flavorText;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public String getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	@Override
	public String toString() {
		return "PokemonSpeciesFlavorText [pokemonSpeciesId=" + pokemonSpeciesId + ", versionId=" + versionId
				+ ", flavorText=" + flavorText + "]";
	}
}