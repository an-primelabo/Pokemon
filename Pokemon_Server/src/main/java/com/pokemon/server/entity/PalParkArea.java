package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pal_park_areas")
public class PalParkArea implements Serializable {
	private static final long serialVersionUID = -8338941929107008243L;

	@Id
	@Column(name = "pal_park_area_id", unique = true, nullable = false)
	private Integer palParkAreaId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public PalParkArea() {
	}

	public PalParkArea(Integer palParkAreaId, String name, String nameAlias) {
		this.palParkAreaId = palParkAreaId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getPalParkAreaId() {
		return palParkAreaId;
	}

	public void setPalParkAreaId(Integer palParkAreaId) {
		this.palParkAreaId = palParkAreaId;
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
		return "PalParkArea [palParkAreaId=" + palParkAreaId + ", name=" + name + ", nameAlias=" + nameAlias + "]";
	}
}