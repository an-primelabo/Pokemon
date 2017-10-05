package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_pokemon_stats")
public class ConquestPokemonStat implements Serializable {
	private static final long serialVersionUID = 5516042229306350059L;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "conquest_stat_id")
	private Integer conquestStatId;

	@Column(name = "base_stat")
	private Integer baseStat;

	public ConquestPokemonStat() {
	}

	public ConquestPokemonStat(Integer pokemonSpeciesId, Integer conquestStatId, Integer baseStat) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.conquestStatId = conquestStatId;
		this.baseStat = baseStat;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getConquestStatId() {
		return conquestStatId;
	}

	public void setConquestStatId(Integer conquestStatId) {
		this.conquestStatId = conquestStatId;
	}

	public Integer getBaseStat() {
		return baseStat;
	}

	public void setBaseStat(Integer baseStat) {
		this.baseStat = baseStat;
	}

	@Override
	public String toString() {
		return "ConquestPokemonStat [pokemonSpeciesId=" + pokemonSpeciesId + ", conquestStatId=" + conquestStatId
				+ ", baseStat=" + baseStat + "]";
	}
}