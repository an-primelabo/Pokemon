package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_location_area_encounter_rates")
public class LocationAreaEncounterRate implements Serializable {
	private static final long serialVersionUID = -8330700048866845107L;

	@Column(name = "location_area_id")
	private Integer locationAreaId;

	@Column(name = "encounter_method_id")
	private Integer encounterMethodId;

	@Column(name = "version_id")
	private Integer versionId;

	@Column(name = "rate")
	private Integer rate;

	public LocationAreaEncounterRate() {
	}

	public LocationAreaEncounterRate(Integer locationAreaId, Integer encounterMethodId, Integer versionId,
			Integer rate) {
		this.locationAreaId = locationAreaId;
		this.encounterMethodId = encounterMethodId;
		this.versionId = versionId;
		this.rate = rate;
	}

	public Integer getLocationAreaId() {
		return locationAreaId;
	}

	public void setLocationAreaId(Integer locationAreaId) {
		this.locationAreaId = locationAreaId;
	}

	public Integer getEncounterMethodId() {
		return encounterMethodId;
	}

	public void setEncounterMethodId(Integer encounterMethodId) {
		this.encounterMethodId = encounterMethodId;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "LocationAreaEncounterRate [locationAreaId=" + locationAreaId + ", encounterMethodId="
				+ encounterMethodId + ", versionId=" + versionId + ", rate=" + rate + "]";
	}
}