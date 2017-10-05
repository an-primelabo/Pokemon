package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_generations")
public class Generation implements Serializable {
	private static final long serialVersionUID = 7435606208459196024L;

	@Id
	@Column(name = "generation_id", unique = true, nullable = false)
	private Integer generationId;

	@Column(name = "region_id")
	private Integer regionId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public Generation() {
	}

	public Generation(Integer generationId, Integer regionId, String name, String nameAlias) {
		this.generationId = generationId;
		this.regionId = regionId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getGenerationId() {
		return generationId;
	}

	public void setGenerationId(Integer generationId) {
		this.generationId = generationId;
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
		return "Generation [generationId=" + generationId + ", regionId=" + regionId + ", name=" + name + ", nameAlias="
				+ nameAlias + "]";
	}
}