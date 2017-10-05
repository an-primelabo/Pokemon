package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokeathlon_stats")
public class PokeathlonStat implements Serializable {
	private static final long serialVersionUID = 2642040134096474314L;

	@Id
	@Column(name = "pokeathlon_stat_id", unique = true, nullable = false)
	private Integer pokeathlonStatId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public PokeathlonStat() {
	}

	public PokeathlonStat(Integer pokeathlonStatId, String name, String nameAlias) {
		this.pokeathlonStatId = pokeathlonStatId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getPokeathlonStatId() {
		return pokeathlonStatId;
	}

	public void setPokeathlonStatId(Integer pokeathlonStatId) {
		this.pokeathlonStatId = pokeathlonStatId;
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
		return "PokeathlonStat [pokeathlonStatId=" + pokeathlonStatId + ", name=" + name + ", nameAlias=" + nameAlias
				+ "]";
	}
}