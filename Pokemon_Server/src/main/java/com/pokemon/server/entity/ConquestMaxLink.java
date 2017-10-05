package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_max_links")
public class ConquestMaxLink implements Serializable {
	private static final long serialVersionUID = -8695868691152502096L;

	@Column(name = "conquest_warrior_rank_id")
	private Integer conquestWarriorRankId;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "max_link")
	private Integer maxLink;

	public ConquestMaxLink() {
	}

	public ConquestMaxLink(Integer conquestWarriorRankId, Integer pokemonSpeciesId, Integer maxLink) {
		this.conquestWarriorRankId = conquestWarriorRankId;
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.maxLink = maxLink;
	}

	public Integer getConquestWarriorRankId() {
		return conquestWarriorRankId;
	}

	public void setConquestWarriorRankId(Integer conquestWarriorRankId) {
		this.conquestWarriorRankId = conquestWarriorRankId;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getMaxLink() {
		return maxLink;
	}

	public void setMaxLink(Integer maxLink) {
		this.maxLink = maxLink;
	}

	@Override
	public String toString() {
		return "ConquestMaxLink [conquestWarriorRankId=" + conquestWarriorRankId + ", pokemonSpeciesId="
				+ pokemonSpeciesId + ", maxLink=" + maxLink + "]";
	}
}