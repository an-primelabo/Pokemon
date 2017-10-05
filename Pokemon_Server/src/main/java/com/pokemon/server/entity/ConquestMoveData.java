package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_move_data")
public class ConquestMoveData implements Serializable {
	private static final long serialVersionUID = -3858046039362703227L;

	@Column(name = "conquest_move_id")
	private Integer conquestMoveId;

	@Column(name = "power")
	private Integer power;

	@Column(name = "accuracy")
	private Integer accuracy;

	@Column(name = "effect_chance")
	private Integer effectChance;

	@Column(name = "conquest_move_effect_id")
	private Integer conquestMoveEffectId;

	@Column(name = "conquest_move_range_id")
	private Integer conquestMoveRangeId;

	@Column(name = "conquest_move_displacement_id")
	private Integer conquestMoveDisplacementId;

	public ConquestMoveData() {
	}

	public ConquestMoveData(Integer conquestMoveId, Integer power, Integer accuracy, Integer effectChance,
			Integer conquestMoveEffectId, Integer conquestMoveRangeId, Integer conquestMoveDisplacementId) {
		this.conquestMoveId = conquestMoveId;
		this.power = power;
		this.accuracy = accuracy;
		this.effectChance = effectChance;
		this.conquestMoveEffectId = conquestMoveEffectId;
		this.conquestMoveRangeId = conquestMoveRangeId;
		this.conquestMoveDisplacementId = conquestMoveDisplacementId;
	}

	public Integer getConquestMoveId() {
		return conquestMoveId;
	}

	public void setConquestMoveId(Integer conquestMoveId) {
		this.conquestMoveId = conquestMoveId;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Integer getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}

	public Integer getEffectChance() {
		return effectChance;
	}

	public void setEffectChance(Integer effectChance) {
		this.effectChance = effectChance;
	}

	public Integer getConquestMoveEffectId() {
		return conquestMoveEffectId;
	}

	public void setConquestMoveEffectId(Integer conquestMoveEffectId) {
		this.conquestMoveEffectId = conquestMoveEffectId;
	}

	public Integer getConquestMoveRangeId() {
		return conquestMoveRangeId;
	}

	public void setConquestMoveRangeId(Integer conquestMoveRangeId) {
		this.conquestMoveRangeId = conquestMoveRangeId;
	}

	public Integer getConquestMoveDisplacementId() {
		return conquestMoveDisplacementId;
	}

	public void setConquestMoveDisplacementId(Integer conquestMoveDisplacementId) {
		this.conquestMoveDisplacementId = conquestMoveDisplacementId;
	}

	@Override
	public String toString() {
		return "ConquestMoveData [conquestMoveId=" + conquestMoveId + ", power=" + power + ", accuracy=" + accuracy
				+ ", effectChance=" + effectChance + ", conquestMoveEffectId=" + conquestMoveEffectId
				+ ", conquestMoveRangeId=" + conquestMoveRangeId + ", conquestMoveDisplacementId="
				+ conquestMoveDisplacementId + "]";
	}
}