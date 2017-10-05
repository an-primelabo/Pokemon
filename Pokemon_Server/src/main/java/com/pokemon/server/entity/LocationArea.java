package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_location_areas")
public class LocationArea implements Serializable {
	private static final long serialVersionUID = -3836448239880194459L;

	@Id
	@Column(name = "location_area_id", unique = true, nullable = false)
	private Integer locationAreaId;

	@Column(name = "location_id")
	private Integer locationId;

	@Column(name = "game_index")
	private Integer gameIndex;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	public LocationArea() {
	}

	public LocationArea(Integer locationAreaId, Integer locationId, Integer gameIndex, String name, String nameAlias) {
		this.locationAreaId = locationAreaId;
		this.locationId = locationId;
		this.gameIndex = gameIndex;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getLocationAreaId() {
		return locationAreaId;
	}

	public void setLocationAreaId(Integer locationAreaId) {
		this.locationAreaId = locationAreaId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	@Override
	public String toString() {
		return "LocationArea [locationAreaId=" + locationAreaId + ", locationId=" + locationId + ", gameIndex="
				+ gameIndex + ", name=" + name + ", nameAlias=" + nameAlias + "]";
	}
}