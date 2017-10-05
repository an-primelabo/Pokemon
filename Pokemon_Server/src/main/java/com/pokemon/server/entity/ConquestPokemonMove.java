package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_pokemon_moves")
public class ConquestPokemonMove implements Serializable {
	private static final long serialVersionUID = -4851170911880321455L;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "conquest_move_id")
	private Integer conquestMoveId;

	public ConquestPokemonMove() {
	}

	public ConquestPokemonMove(Integer pokemonSpeciesId, Integer conquestMoveId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.conquestMoveId = conquestMoveId;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getConquestMoveId() {
		return conquestMoveId;
	}

	public void setConquestMoveId(Integer conquestMoveId) {
		this.conquestMoveId = conquestMoveId;
	}

	@Override
	public String toString() {
		return "ConquestPokemonMove [pokemonSpeciesId=" + pokemonSpeciesId + ", conquestMoveId=" + conquestMoveId + "]";
	}
}