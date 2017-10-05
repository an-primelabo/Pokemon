package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_items")
public class PokemonItem implements Serializable {
	private static final long serialVersionUID = 2437165636765925815L;

	@Column(name = "pokemon_id")
	private Integer pokemonId;

	@Column(name = "version_id")
	private Integer versionId;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "rarity")
	private Integer rarity;

	public PokemonItem() {
	}

	public PokemonItem(Integer pokemonId, Integer versionId, Integer itemId, Integer rarity) {
		this.pokemonId = pokemonId;
		this.versionId = versionId;
		this.itemId = itemId;
		this.rarity = rarity;
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

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getRarity() {
		return rarity;
	}

	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}

	@Override
	public String toString() {
		return "PokemonItem [pokemonId=" + pokemonId + ", versionId=" + versionId + ", itemId=" + itemId + ", rarity="
				+ rarity + "]";
	}
}