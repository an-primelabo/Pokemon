package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_move_methods")
public class PokemonMoveMethod implements Serializable {
	private static final long serialVersionUID = -6410768002207281710L;

	@Id
	@Column(name = "pokemon_move_method_id", unique = true, nullable = false)
	private Integer pokemonMoveMethodId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "description")
	private String description;

	public PokemonMoveMethod() {
	}

	public PokemonMoveMethod(Integer pokemonMoveMethodId, String name, String nameAlias, String description) {
		this.pokemonMoveMethodId = pokemonMoveMethodId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.description = description;
	}

	public Integer getPokemonMoveMethodId() {
		return pokemonMoveMethodId;
	}

	public void setPokemonMoveMethodId(Integer pokemonMoveMethodId) {
		this.pokemonMoveMethodId = pokemonMoveMethodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PokemonMoveMethod [pokemonMoveMethodId=" + pokemonMoveMethodId + ", name=" + name + ", nameAlias="
				+ nameAlias + ", description=" + description + "]";
	}
}