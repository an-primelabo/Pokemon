package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_moves")
public class Move implements Serializable {
	private static final long serialVersionUID = -1286703997211152720L;

	@Id
	@Column(name = "move_id", unique = true, nullable = false)
	private Integer moveId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "generation_id")
	private Integer generationId;

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

	@Column(name = "move_damage_class_id")
	private Integer moveDamageClassId;

	@Column(name = "move_effect_id")
	private Integer moveEffectId;

	@Column(name = "effect_chance")
	private Integer effectChance;

	@Column(name = "contest_type_id")
	private Integer contestTypeId;

	@Column(name = "contest_effect_id")
	private Integer contestEffectId;

	@Column(name = "super_contest_effect_id")
	private Integer superContestEffectId;

	public Move() {
	}

	public Move(Integer moveId, String name, String nameAlias, Integer generationId, Integer typeId, Integer power,
			Integer pp, Integer accuracy, Integer priority, Integer moveTargetId, Integer moveDamageClassId,
			Integer moveEffectId, Integer effectChance, Integer contestTypeId, Integer contestEffectId,
			Integer superContestEffectId) {
		this.moveId = moveId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.generationId = generationId;
		this.typeId = typeId;
		this.power = power;
		this.pp = pp;
		this.accuracy = accuracy;
		this.priority = priority;
		this.moveTargetId = moveTargetId;
		this.moveDamageClassId = moveDamageClassId;
		this.moveEffectId = moveEffectId;
		this.effectChance = effectChance;
		this.contestTypeId = contestTypeId;
		this.contestEffectId = contestEffectId;
		this.superContestEffectId = superContestEffectId;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
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

	public Integer getGenerationId() {
		return generationId;
	}

	public void setGenerationId(Integer generationId) {
		this.generationId = generationId;
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

	public Integer getMoveDamageClassId() {
		return moveDamageClassId;
	}

	public void setMoveDamageClassId(Integer moveDamageClassId) {
		this.moveDamageClassId = moveDamageClassId;
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

	public Integer getContestTypeId() {
		return contestTypeId;
	}

	public void setContestTypeId(Integer contestTypeId) {
		this.contestTypeId = contestTypeId;
	}

	public Integer getContestEffectId() {
		return contestEffectId;
	}

	public void setContestEffectId(Integer contestEffectId) {
		this.contestEffectId = contestEffectId;
	}

	public Integer getSuperContestEffectId() {
		return superContestEffectId;
	}

	public void setSuperContestEffectId(Integer superContestEffectId) {
		this.superContestEffectId = superContestEffectId;
	}

	@Override
	public String toString() {
		return "Move [moveId=" + moveId + ", name=" + name + ", nameAlias=" + nameAlias + ", generationId="
				+ generationId + ", typeId=" + typeId + ", power=" + power + ", pp=" + pp + ", accuracy=" + accuracy
				+ ", priority=" + priority + ", moveTargetId=" + moveTargetId + ", moveDamageClassId="
				+ moveDamageClassId + ", moveEffectId=" + moveEffectId + ", effectChance=" + effectChance
				+ ", contestTypeId=" + contestTypeId + ", contestEffectId=" + contestEffectId
				+ ", superContestEffectId=" + superContestEffectId + "]";
	}
}