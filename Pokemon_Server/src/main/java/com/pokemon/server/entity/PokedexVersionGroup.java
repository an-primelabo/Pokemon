package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokedex_version_groups")
public class PokedexVersionGroup implements Serializable {
	private static final long serialVersionUID = -657432072459482473L;

	@Column(name = "pokedex_id")
	private Integer pokedexId;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	public PokedexVersionGroup() {
	}

	public PokedexVersionGroup(Integer pokedexId, Integer versionGroupId) {
		this.pokedexId = pokedexId;
		this.versionGroupId = versionGroupId;
	}

	public Integer getPokedexId() {
		return pokedexId;
	}

	public void setPokedexId(Integer pokedexId) {
		this.pokedexId = pokedexId;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	@Override
	public String toString() {
		return "PokedexVersionGroup [pokedexId=" + pokedexId + ", versionGroupId=" + versionGroupId + "]";
	}
}