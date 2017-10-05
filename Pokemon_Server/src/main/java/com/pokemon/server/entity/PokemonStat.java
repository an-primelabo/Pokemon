package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_stats")
public class PokemonStat implements Serializable {
	private static final long serialVersionUID = 8979041940650791415L;

	@Column(name = "pokemon_id")
	private Integer pokemonId;

	@Column(name = "stat_id")
	private Integer statId;

	@Column(name = "base_stat")
	private Integer baseStat;

	@Column(name = "effort")
	private Integer effort;

	public PokemonStat() {
	}

	public PokemonStat(Integer pokemonId, Integer statId, Integer baseStat, Integer effort) {
		this.pokemonId = pokemonId;
		this.statId = statId;
		this.baseStat = baseStat;
		this.effort = effort;
	}

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public Integer getStatId() {
		return statId;
	}

	public void setStatId(Integer statId) {
		this.statId = statId;
	}

	public Integer getBaseStat() {
		return baseStat;
	}

	public void setBaseStat(Integer baseStat) {
		this.baseStat = baseStat;
	}

	public Integer getEffort() {
		return effort;
	}

	public void setEffort(Integer effort) {
		this.effort = effort;
	}

	@Override
	public String toString() {
		return "PokemonStat [pokemonId=" + pokemonId + ", statId=" + statId + ", baseStat=" + baseStat + ", effort="
				+ effort + "]";
	}
}