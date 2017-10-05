package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_location_game_indices")
public class LocationGameIndices implements Serializable {
	private static final long serialVersionUID = 2402990657829599183L;

	@Column(name = "location_id")
	private Integer locationId;

	@Column(name = "generation_id")
	private Integer generationId;

	@Column(name = "game_index")
	private Integer gameIndex;

	public LocationGameIndices() {
	}

	public LocationGameIndices(Integer locationId, Integer generationId, Integer gameIndex) {
		this.locationId = locationId;
		this.generationId = generationId;
		this.gameIndex = gameIndex;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getGenerationId() {
		return generationId;
	}

	public void setGenerationId(Integer generationId) {
		this.generationId = generationId;
	}

	public Integer getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	@Override
	public String toString() {
		return "LocationGameIndices [locationId=" + locationId + ", generationId=" + generationId + ", gameIndex="
				+ gameIndex + "]";
	}
}