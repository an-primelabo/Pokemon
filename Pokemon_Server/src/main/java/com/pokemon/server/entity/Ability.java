package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_abilities")
public class Ability implements Serializable {
	private static final long serialVersionUID = 1423950626411790272L;

	@Id
	@Column(name = "ability_id", unique = true, nullable = false)
	private Integer abilityId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "short_effect")
	private String shortEffect;

	@Column(name = "effect")
	private String effect;

	@Column(name = "generation_id")
	private Integer generationId;

	@Column(name = "is_main_series")
	private Boolean isMainSeries;

	public Ability() {
	}

	public Ability(Integer abilityId, String name, String nameAlias, String shortEffect, String effect,
			Integer generationId, Boolean isMainSeries) {
		this.abilityId = abilityId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.shortEffect = shortEffect;
		this.effect = effect;
		this.generationId = generationId;
		this.isMainSeries = (isMainSeries != null) ? isMainSeries : Boolean.TRUE;
	}

	public Ability(Integer abilityId, String name, String nameAlias, String shortEffect, String effect,
			Integer generationId) {
		this.abilityId = abilityId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.shortEffect = shortEffect;
		this.effect = effect;
		this.generationId = generationId;
		this.isMainSeries = Boolean.TRUE;
	}

	public Integer getAbilityId() {
		return abilityId;
	}

	public void setAbilityId(Integer abilityId) {
		this.abilityId = abilityId;
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

	public String getShortEffect() {
		return shortEffect;
	}

	public void setShortEffect(String shortEffect) {
		this.shortEffect = shortEffect;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public Integer getGenerationId() {
		return generationId;
	}

	public void setGenerationId(Integer generationId) {
		this.generationId = generationId;
	}

	public Boolean getIsMainSeries() {
		return isMainSeries;
	}

	public void setIsMainSeries(Boolean isMainSeries) {
		this.isMainSeries = isMainSeries;
	}

	@Override
	public String toString() {
		return "Ability [abilityId=" + abilityId + ", name=" + name + ", nameAlias=" + nameAlias + ", shortEffect="
				+ shortEffect + ", effect=" + effect + ", generationId=" + generationId + ", isMainSeries="
				+ isMainSeries + "]";
	}
}