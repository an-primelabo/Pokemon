package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_form_pokeathlon_stats")
public class PokemonFormPokeathlonStat implements Serializable {
	private static final long serialVersionUID = -3486547401756562524L;

	@Column(name = "pokemon_form_id")
	private Integer pokemonFormId;

	@Column(name = "pokeathlon_stat_id")
	private Integer pokeathlonStatId;

	@Column(name = "minimum_stat")
	private Integer minimumStat;

	@Column(name = "base_stat")
	private Integer baseStat;

	@Column(name = "maximum_stat")
	private Integer maximumStat;

	public PokemonFormPokeathlonStat() {
	}

	public PokemonFormPokeathlonStat(Integer pokemonFormId, Integer pokeathlonStatId, Integer minimumStat,
			Integer baseStat, Integer maximumStat) {
		this.pokemonFormId = pokemonFormId;
		this.pokeathlonStatId = pokeathlonStatId;
		this.minimumStat = minimumStat;
		this.baseStat = baseStat;
		this.maximumStat = maximumStat;
	}

	public Integer getPokemonFormId() {
		return pokemonFormId;
	}

	public void setPokemonFormId(Integer pokemonFormId) {
		this.pokemonFormId = pokemonFormId;
	}

	public Integer getPokeathlonStatId() {
		return pokeathlonStatId;
	}

	public void setPokeathlonStatId(Integer pokeathlonStatId) {
		this.pokeathlonStatId = pokeathlonStatId;
	}

	public Integer getMinimumStat() {
		return minimumStat;
	}

	public void setMinimumStat(Integer minimumStat) {
		this.minimumStat = minimumStat;
	}

	public Integer getBaseStat() {
		return baseStat;
	}

	public void setBaseStat(Integer baseStat) {
		this.baseStat = baseStat;
	}

	public Integer getMaximumStat() {
		return maximumStat;
	}

	public void setMaximumStat(Integer maximumStat) {
		this.maximumStat = maximumStat;
	}

	@Override
	public String toString() {
		return "PokemonFormPokeathlonStat [pokemonFormId=" + pokemonFormId + ", pokeathlonStatId=" + pokeathlonStatId
				+ ", minimumStat=" + minimumStat + ", baseStat=" + baseStat + ", maximumStat=" + maximumStat + "]";
	}
}