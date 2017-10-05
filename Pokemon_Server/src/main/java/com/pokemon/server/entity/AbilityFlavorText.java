package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_ability_flavor_text")
public class AbilityFlavorText implements Serializable {
	private static final long serialVersionUID = 7796307261459324007L;

	@Column(name = "ability_id")
	private Integer abilityId;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	@Column(name = "flavor_text")
	private String flavorText;

	public AbilityFlavorText() {
	}

	public AbilityFlavorText(Integer abilityId, Integer versionGroupId, String flavorText) {
		this.abilityId = abilityId;
		this.versionGroupId = versionGroupId;
		this.flavorText = flavorText;
	}

	public Integer getAbilityId() {
		return abilityId;
	}

	public void setAbilityId(Integer abilityId) {
		this.abilityId = abilityId;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	public String getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	@Override
	public String toString() {
		return "AbilityFlavorText [abilityId=" + abilityId + ", versionGroupId=" + versionGroupId + ", flavorText="
				+ flavorText + "]";
	}
}