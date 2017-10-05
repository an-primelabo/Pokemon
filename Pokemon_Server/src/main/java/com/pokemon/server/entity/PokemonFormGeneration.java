package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_form_generations")
public class PokemonFormGeneration implements Serializable {
	private static final long serialVersionUID = 2530040102184254955L;

	@Column(name = "pokemon_form_id")
	private Integer pokemonFormId;

	@Column(name = "generation_id")
	private Integer generationId;

	@Column(name = "game_index")
	private Integer gameIndex;

	public PokemonFormGeneration() {
	}

	public PokemonFormGeneration(Integer pokemonFormId, Integer generationId, Integer gameIndex) {
		this.pokemonFormId = pokemonFormId;
		this.generationId = generationId;
		this.gameIndex = gameIndex;
	}

	public Integer getPokemonFormId() {
		return pokemonFormId;
	}

	public void setPokemonFormId(Integer pokemonFormId) {
		this.pokemonFormId = pokemonFormId;
	}

	public Integer getGenerationId() {
		return generationId;
	}

	public void setGenerationId(Integer generationId) {
		this.generationId = generationId;
	}

	public Integer getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	@Override
	public String toString() {
		return "PokemonFormGeneration [pokemonFormId=" + pokemonFormId + ", generationId=" + generationId
				+ ", gameIndex=" + gameIndex + "]";
	}
}