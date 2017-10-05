package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_version_group_pokemon_move_methods")
public class VersionGroupPokemonMoveMethod implements Serializable {
	private static final long serialVersionUID = -4174875717543381027L;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	@Column(name = "pokemon_move_method_id")
	private Integer pokemonMoveMethodId;

	public VersionGroupPokemonMoveMethod() {
	}

	public VersionGroupPokemonMoveMethod(Integer versionGroupId, Integer pokemonMoveMethodId) {
		this.versionGroupId = versionGroupId;
		this.pokemonMoveMethodId = pokemonMoveMethodId;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	public Integer getPokemonMoveMethodId() {
		return pokemonMoveMethodId;
	}

	public void setPokemonMoveMethodId(Integer pokemonMoveMethodId) {
		this.pokemonMoveMethodId = pokemonMoveMethodId;
	}

	@Override
	public String toString() {
		return "VersionGroupPokemonMoveMethod [versionGroupId=" + versionGroupId + ", pokemonMoveMethodId="
				+ pokemonMoveMethodId + "]";
	}
}