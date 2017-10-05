package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_encounters")
public class Encounter implements Serializable {
	private static final long serialVersionUID = 3242738730377098796L;

	@Id
	@Column(name = "encounter_id", unique = true, nullable = false)
	private Integer encounterId;

	@Column(name = "version_id")
	private Integer versionId;

	@Column(name = "location_area_id")
	private Integer locationAreaId;

	@Column(name = "encounter_slot_id")
	private Integer encounterSlotId;

	@Column(name = "pokemon_id")
	private Integer pokemonId;

	@Column(name = "min_level")
	private Integer minLevel;

	@Column(name = "max_level")
	private Integer maxLevel;

	public Encounter() {
	}

	public Encounter(Integer encounterId, Integer versionId, Integer locationAreaId, Integer encounterSlotId,
			Integer pokemonId, Integer minLevel, Integer maxLevel) {
		this.encounterId = encounterId;
		this.versionId = versionId;
		this.locationAreaId = locationAreaId;
		this.encounterSlotId = encounterSlotId;
		this.pokemonId = pokemonId;
		this.minLevel = minLevel;
		this.maxLevel = maxLevel;
	}

	public Integer getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public Integer getLocationAreaId() {
		return locationAreaId;
	}

	public void setLocationAreaId(Integer locationAreaId) {
		this.locationAreaId = locationAreaId;
	}

	public Integer getEncounterSlotId() {
		return encounterSlotId;
	}

	public void setEncounterSlotId(Integer encounterSlotId) {
		this.encounterSlotId = encounterSlotId;
	}

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public Integer getMinLevel() {
		return minLevel;
	}

	public void setMinLevel(Integer minLevel) {
		this.minLevel = minLevel;
	}

	public Integer getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(Integer maxLevel) {
		this.maxLevel = maxLevel;
	}

	@Override
	public String toString() {
		return "Encounter [encounterId=" + encounterId + ", versionId=" + versionId + ", locationAreaId="
				+ locationAreaId + ", encounterSlotId=" + encounterSlotId + ", pokemonId=" + pokemonId + ", minLevel="
				+ minLevel + ", maxLevel=" + maxLevel + "]";
	}
}