package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_pokemon_abilities")
public class ConquestPokemonAbility implements Serializable {
	private static final long serialVersionUID = -4152042723044398369L;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "slot")
	private Integer slot;

	@Column(name = "ability_id")
	private Integer ability_id;

	public ConquestPokemonAbility() {
	}

	public ConquestPokemonAbility(Integer pokemonSpeciesId, Integer slot, Integer ability_id) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.slot = slot;
		this.ability_id = ability_id;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public Integer getAbility_id() {
		return ability_id;
	}

	public void setAbility_id(Integer ability_id) {
		this.ability_id = ability_id;
	}

	@Override
	public String toString() {
		return "ConquestPokemonAbility [pokemonSpeciesId=" + pokemonSpeciesId + ", slot=" + slot + ", ability_id="
				+ ability_id + "]";
	}
}