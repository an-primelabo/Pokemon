package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_ability_changelog")
public class AbilityChangelog implements Serializable {
	private static final long serialVersionUID = 8500445059930710941L;

	@Id
	@Column(name = "ability_changelog_id", unique = true, nullable = false)
	private Integer abilityChangelogId;

	@Column(name = "ability_id")
	private Integer abilityId;

	@Column(name = "changed_in_version_group_id")
	private Integer changedInVersionGroupId;

	@Column(name = "effect")
	private String effect;

	public AbilityChangelog() {
	}

	public AbilityChangelog(Integer abilityChangelogId, Integer abilityId, Integer changedInVersionGroupId,
			String effect) {
		this.abilityChangelogId = abilityChangelogId;
		this.abilityId = abilityId;
		this.changedInVersionGroupId = changedInVersionGroupId;
		this.effect = effect;
	}

	public Integer getAbilityChangelogId() {
		return abilityChangelogId;
	}

	public void setAbilityChangelogId(Integer abilityChangelogId) {
		this.abilityChangelogId = abilityChangelogId;
	}

	public Integer getAbilityId() {
		return abilityId;
	}

	public void setAbilityId(Integer abilityId) {
		this.abilityId = abilityId;
	}

	public Integer getChangedInVersionGroupId() {
		return changedInVersionGroupId;
	}

	public void setChangedInVersionGroupId(Integer changedInVersionGroupId) {
		this.changedInVersionGroupId = changedInVersionGroupId;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	@Override
	public String toString() {
		return "AbilityChangelog [abilityChangelogId=" + abilityChangelogId + ", abilityId=" + abilityId
				+ ", changedInVersionGroupId=" + changedInVersionGroupId + ", effect=" + effect + "]";
	}
}