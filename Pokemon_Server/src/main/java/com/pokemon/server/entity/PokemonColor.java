package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_colors")
public class PokemonColor implements Serializable {
	private static final long serialVersionUID = 7940929889641358153L;

	@Id
	@Column(name = "pokemon_color_id", unique = true, nullable = false)
	private Integer pokemonColorId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public PokemonColor() {
	}

	public PokemonColor(Integer pokemonColorId, String name, String nameAlias) {
		this.pokemonColorId = pokemonColorId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getPokemonColorId() {
		return pokemonColorId;
	}

	public void setPokemonColorId(Integer pokemonColorId) {
		this.pokemonColorId = pokemonColorId;
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
		return "PokemonColor [pokemonColorId=" + pokemonColorId + ", name=" + name + ", nameAlias=" + nameAlias + "]";
	}
}