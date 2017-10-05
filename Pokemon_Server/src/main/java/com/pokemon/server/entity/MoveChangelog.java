package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_changelog")
public class MoveChangelog implements Serializable {
	private static final long serialVersionUID = 1076602092545733654L;

	@Column(name = "move_id")
	private Integer moveId;

	@Column(name = "changed_in_version_group_id")
	private Integer changedInVersionGroupId;

	@Column(name = "type_id")
	private Integer typeId;

	@Column(name = "power")
	private Integer power;

	@Column(name = "pp")
	private Integer pp;

	@Column(name = "accuracy")
	private Integer accuracy;

	@Column(name = "priority")
	private Integer priority;

	@Column(name = "move_target_id")
	private Integer moveTargetId;

	@Column(name = "move_effect_id")
	private Integer moveEffectId;

	@Column(name = "effect_chance")
	private Integer effectChance;

	public MoveChangelog() {
	}

	public MoveChangelog(Integer moveId, Integer changedInVersionGroupId, Integer typeId, Integer power, Integer pp,
			Integer accuracy, Integer priority, Integer moveTargetId, Integer moveEffectId, Integer effectChance) {
		this.moveId = moveId;
		this.changedInVersionGroupId = changedInVersionGroupId;
		this.typeId = typeId;
		this.power = power;
		this.pp = pp;
		this.accuracy = accuracy;
		this.priority = priority;
		this.moveTargetId = moveTargetId;
		this.moveEffectId = moveEffectId;
		this.effectChance = effectChance;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}

	public Integer getChangedInVersionGroupId() {
		return changedInVersionGroupId;
	}

	public void setChangedInVersionGroupId(Integer changedInVersionGroupId) {
		this.changedInVersionGroupId = changedInVersionGroupId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Integer getPp() {
		return pp;
	}

	public void setPp(Integer pp) {
		this.pp = pp;
	}

	public Integer getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getMoveTargetId() {
		return moveTargetId;
	}

	public void setMoveTargetId(Integer moveTargetId) {
		this.moveTargetId = moveTargetId;
	}

	public Integer getMoveEffectId() {
		return moveEffectId;
	}

	public void setMoveEffectId(Integer moveEffectId) {
		this.moveEffectId = moveEffectId;
	}

	public Integer getEffectChance() {
		return effectChance;
	}

	public void setEffectChance(Integer effectChance) {
		this.effectChance = effectChance;
	}

	@Override
	public String toString() {
		return "MoveChangelog [moveId=" + moveId + ", changedInVersionGroupId=" + changedInVersionGroupId + ", typeId="
				+ typeId + ", power=" + power + ", pp=" + pp + ", accuracy=" + accuracy + ", priority=" + priority
				+ ", moveTargetId=" + moveTargetId + ", moveEffectId=" + moveEffectId + ", effectChance=" + effectChance
				+ "]";
	}
}