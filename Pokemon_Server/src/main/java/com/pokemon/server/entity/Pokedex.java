package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokedexes")
public class Pokedex implements Serializable {
	private static final long serialVersionUID = 6136723762924242798L;

	@Id
	@Column(name = "pokedex_id", unique = true, nullable = false)
	private Integer pokedexId;

	@Column(name = "region_id")
	private Integer regionId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "description")
	private String description;

	@Column(name = "is_main_series")
	private Boolean isMainSeries;

	public Pokedex() {
	}

	public Pokedex(Integer pokedexId, Integer regionId, String name, String nameAlias, String description,
			Boolean isMainSeries) {
		this.pokedexId = pokedexId;
		this.regionId = regionId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.description = description;
		this.isMainSeries = (isMainSeries != null) ? isMainSeries : Boolean.TRUE;
	}

	public Pokedex(Integer pokedexId, Integer regionId, String name, String nameAlias, String description) {
		this.pokedexId = pokedexId;
		this.regionId = regionId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.description = description;
		this.isMainSeries = Boolean.TRUE;
	}

	public Integer getPokedexId() {
		return pokedexId;
	}

	public void setPokedexId(Integer pokedexId) {
		this.pokedexId = pokedexId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsMainSeries() {
		return isMainSeries;
	}

	public void setIsMainSeries(Boolean isMainSeries) {
		this.isMainSeries = isMainSeries;
	}

	@Override
	public String toString() {
		return "Pokedex [pokedexId=" + pokedexId + ", regionId=" + regionId + ", name=" + name + ", nameAlias="
				+ nameAlias + ", description=" + description + ", isMainSeries=" + isMainSeries + "]";
	}
}