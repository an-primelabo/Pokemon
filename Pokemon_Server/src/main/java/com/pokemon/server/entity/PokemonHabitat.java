package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_habitats")
public class PokemonHabitat implements Serializable {
	private static final long serialVersionUID = -4533487135082458527L;

	@Id
	@Column(name = "pokemon_habitat_id", unique = true, nullable = false)
	private Integer pokemonHabitatId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public PokemonHabitat() {
	}

	public PokemonHabitat(Integer pokemonHabitatId, String name, String nameAlias) {
		this.pokemonHabitatId = pokemonHabitatId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getPokemonHabitatId() {
		return pokemonHabitatId;
	}

	public void setPokemonHabitatId(Integer pokemonHabitatId) {
		this.pokemonHabitatId = pokemonHabitatId;
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

	@Override
	public String toString() {
		return "PokemonHabitat [pokemonHabitatId=" + pokemonHabitatId + ", name=" + name + ", nameAlias=" + nameAlias
				+ "]";
	}
}