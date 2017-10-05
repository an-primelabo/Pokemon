package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_game_indices")
public class PokemonGameIndices implements Serializable {
	private static final long serialVersionUID = -7206964446918472310L;

	@Column(name = "pokemon_id")
	private Integer pokemonId;

	@Column(name = "version_id")
	private Integer versionId;

	@Column(name = "game_index")
	private Integer gameIndex;

	public PokemonGameIndices() {
	}

	public PokemonGameIndices(Integer pokemonId, Integer versionId, Integer gameIndex) {
		this.pokemonId = pokemonId;
		this.versionId = versionId;
		this.gameIndex = gameIndex;
	}

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public Integer getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	@Override
	public String toString() {
		return "PokemonGameIndices [pokemonId=" + pokemonId + ", versionId=" + versionId + ", gameIndex=" + gameIndex
				+ "]";
	}
}