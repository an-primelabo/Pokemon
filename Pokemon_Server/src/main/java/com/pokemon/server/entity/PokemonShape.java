package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_shapes")
public class PokemonShape implements Serializable {
	private static final long serialVersionUID = -6765936305331686040L;

	@Id
	@Column(name = "pokemon_shape_id", unique = true, nullable = false)
	private Integer pokemonShapeId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "name_awesome", length = 16)
	private String nameAwesome;

	@Column(name = "description")
	private String description;

	public PokemonShape() {
	}

	public PokemonShape(Integer pokemonShapeId, String name, String nameAlias, String nameAwesome, String description) {
		this.pokemonShapeId = pokemonShapeId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.nameAwesome = nameAwesome;
		this.description = description;
	}

	public Integer getPokemonShapeId() {
		return pokemonShapeId;
	}

	public void setPokemonShapeId(Integer pokemonShapeId) {
		this.pokemonShapeId = pokemonShapeId;
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

	public String getNameAwesome() {
		return nameAwesome;
	}

	public void setNameAwesome(String nameAwesome) {
		this.nameAwesome = nameAwesome;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PokemonShape [pokemonShapeId=" + pokemonShapeId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", nameAwesome=" + nameAwesome + ", description=" + description + "]";
	}
}