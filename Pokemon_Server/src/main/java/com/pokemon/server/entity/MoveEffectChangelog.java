package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_effect_changelog")
public class MoveEffectChangelog implements Serializable {
	private static final long serialVersionUID = -7040403482948586159L;

	@Id
	@Column(name = "move_effect_changelog_id", unique = true, nullable = false)
	private Integer moveEffectChangelogId;

	@Column(name = "move_effect_id")
	private Integer moveEffectId;

	@Column(name = "changed_in_version_group_id")
	private Integer changedInVersionGroupId;

	@Column(name = "effect")
	private String effect;

	public MoveEffectChangelog() {
	}

	public MoveEffectChangelog(Integer moveEffectChangelogId, Integer moveEffectId, Integer changedInVersionGroupId,
			String effect) {
		this.moveEffectChangelogId = moveEffectChangelogId;
		this.moveEffectId = moveEffectId;
		this.changedInVersionGroupId = changedInVersionGroupId;
		this.effect = effect;
	}

	public Integer getMoveEffectChangelogId() {
		return moveEffectChangelogId;
	}

	public void setMoveEffectChangelogId(Integer moveEffectChangelogId) {
		this.moveEffectChangelogId = moveEffectChangelogId;
	}

	public Integer getMoveEffectId() {
		return moveEffectId;
	}

	public void setMoveEffectId(Integer moveEffectId) {
		this.moveEffectId = moveEffectId;
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
		return "MoveEffectChangelog [moveEffectChangelogId=" + moveEffectChangelogId + ", moveEffectId=" + moveEffectId
				+ ", changedInVersionGroupId=" + changedInVersionGroupId + ", effect=" + effect + "]";
	}
}