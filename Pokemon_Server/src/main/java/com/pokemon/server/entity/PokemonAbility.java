package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_abilities")
public class PokemonAbility implements Serializable {
	private static final long serialVersionUID = 7149216721042468117L;

	@Column(name = "pokemon_id")
	private Integer pokemonId;

	@Column(name = "ability_id")
	private Integer abilityId;

	@Column(name = "is_hidden")
	private Boolean isHidden;

	@Column(name = "slot")
	private Integer slot;

	public PokemonAbility() {
	}

	public PokemonAbility(Integer pokemonId, Integer abilityId, Boolean isHidden, Integer slot) {
		this.pokemonId = pokemonId;
		this.abilityId = abilityId;
		this.isHidden = (isHidden != null) ? isHidden : Boolean.FALSE;
		this.slot = slot;
	}

	public PokemonAbility(Integer pokemonId, Integer abilityId, Integer slot) {
		this.pokemonId = pokemonId;
		this.abilityId = abilityId;
		this.isHidden = Boolean.FALSE;
		this.slot = slot;
	}

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public Integer getAbilityId() {
		return abilityId;
	}

	public void setAbilityId(Integer abilityId) {
		this.abilityId = abilityId;
	}

	public Boolean getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "PokemonAbility [pokemonId=" + pokemonId + ", abilityId=" + abilityId + ", isHidden=" + isHidden
				+ ", slot=" + slot + "]";
	}
}