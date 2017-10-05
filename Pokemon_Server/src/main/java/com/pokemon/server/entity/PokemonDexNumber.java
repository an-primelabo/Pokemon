package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_dex_numbers")
public class PokemonDexNumber implements Serializable {
	private static final long serialVersionUID = -7710435738245520174L;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "pokedex_id")
	private Integer pokedexId;

	@Column(name = "pokedex_number")
	private Integer pokedexNumber;

	public PokemonDexNumber() {
	}

	public PokemonDexNumber(Integer pokemonSpeciesId, Integer pokedexId, Integer pokedexNumber) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.pokedexId = pokedexId;
		this.pokedexNumber = pokedexNumber;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getPokedexId() {
		return pokedexId;
	}

	public void setPokedexId(Integer pokedexId) {
		this.pokedexId = pokedexId;
	}

	public Integer getPokedexNumber() {
		return pokedexNumber;
	}

	public void setPokedexNumber(Integer pokedexNumber) {
		this.pokedexNumber = pokedexNumber;
	}

	@Override
	public String toString() {
		return "PokemonDexNumber [pokemonSpeciesId=" + pokemonSpeciesId + ", pokedexId=" + pokedexId
				+ ", pokedexNumber=" + pokedexNumber + "]";
	}
}