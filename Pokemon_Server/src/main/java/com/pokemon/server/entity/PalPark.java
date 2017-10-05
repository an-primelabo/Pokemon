package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pal_park")
public class PalPark implements Serializable {
	private static final long serialVersionUID = 3905805919831688652L;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "pal_park_area_id")
	private Integer palParkAreaId;

	@Column(name = "base_score")
	private Integer baseScore;

	@Column(name = "rate")
	private Integer rate;

	public PalPark() {
	}

	public PalPark(Integer pokemonSpeciesId, Integer palParkAreaId, Integer baseScore, Integer rate) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.palParkAreaId = palParkAreaId;
		this.baseScore = baseScore;
		this.rate = rate;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getPalParkAreaId() {
		return palParkAreaId;
	}

	public void setPalParkAreaId(Integer palParkAreaId) {
		this.palParkAreaId = palParkAreaId;
	}

	public Integer getBaseScore() {
		return baseScore;
	}

	public void setBaseScore(Integer baseScore) {
		this.baseScore = baseScore;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "PalPark [pokemonSpeciesId=" + pokemonSpeciesId + ", palParkAreaId=" + palParkAreaId + ", baseScore="
				+ baseScore + ", rate=" + rate + "]";
	}
}