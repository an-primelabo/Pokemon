package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_regions")
public class Region implements Serializable {
	private static final long serialVersionUID = 1222960411992299943L;

	@Id
	@Column(name = "region_id", unique = true, nullable = false)
	private Integer regionId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public Region() {
	}

	public Region(Integer regionId, String name, String nameAlias) {
		this.regionId = regionId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Region(String name, String nameAlias) {
		this.name = name;
		this.nameAlias = nameAlias;
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
		return "Region [regionId=" + regionId + ", name=" + name + ", nameAlias=" + nameAlias + "]";
	}
}