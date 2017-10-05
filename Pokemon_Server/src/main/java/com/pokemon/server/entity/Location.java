package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_locations")
public class Location implements Serializable {
	private static final long serialVersionUID = -7588095239544092942L;

	@Id
	@Column(name = "location_id", unique = true, nullable = false)
	private Integer locationId;

	@Column(name = "region_id")
	private Integer regionId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	public Location() {
	}

	public Location(Integer locationId, Integer regionId, String name, String nameAlias) {
		this.locationId = locationId;
		this.regionId = regionId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
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
		return "Location [locationId=" + locationId + ", regionId=" + regionId + ", name=" + name + ", nameAlias="
				+ nameAlias + "]";
	}
}