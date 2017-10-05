package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_types")
public class PokemonType implements Serializable {
	private static final long serialVersionUID = -6678426349684377336L;

	@Column(name = "pokemon_id")
	private Integer pokemonId;

	@Column(name = "type_id")
	private Integer typeId;

	@Column(name = "slot")
	private Integer slot;

	public PokemonType() {
	}

	public PokemonType(Integer pokemonId, Integer typeId, Integer slot) {
		this.pokemonId = pokemonId;
		this.typeId = typeId;
		this.slot = slot;
	}

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "PokemonType [pokemonId=" + pokemonId + ", typeId=" + typeId + ", slot=" + slot + "]";
	}
}