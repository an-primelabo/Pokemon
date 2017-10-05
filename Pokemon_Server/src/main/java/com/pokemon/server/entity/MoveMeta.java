package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_meta")
public class MoveMeta implements Serializable {
	private static final long serialVersionUID = -2368847388096625401L;

	@Column(name = "move_id")
	private Integer moveId;

	@Column(name = "move_meta_category_id")
	private Integer moveMetaCategoryId;

	@Column(name = "move_meta_ailment_id")
	private Integer moveMetaAilmentId;

	@Column(name = "min_hits")
	private Integer minHits;

	@Column(name = "max_hits")
	private Integer maxHits;

	@Column(name = "min_turns")
	private Integer minTurns;

	@Column(name = "max_turns")
	private Integer maxTurns;

	@Column(name = "drain")
	private Integer drain;

	@Column(name = "healing")
	private Integer healing;

	@Column(name = "crit_rate")
	private Integer critRate;

	@Column(name = "ailment_chance")
	private Integer ailmentChance;

	@Column(name = "flinch_chance")
	private Integer flinchChance;

	@Column(name = "stat_chance")
	private Integer statChance;

	public MoveMeta() {
	}

	public MoveMeta(Integer moveId, Integer moveMetaCategoryId, Integer moveMetaAilmentId, Integer minHits,
			Integer maxHits, Integer minTurns, Integer maxTurns, Integer drain, Integer healing, Integer critRate,
			Integer ailmentChance, Integer flinchChance, Integer statChance) {
		this.moveId = moveId;
		this.moveMetaCategoryId = moveMetaCategoryId;
		this.moveMetaAilmentId = moveMetaAilmentId;
		this.minHits = minHits;
		this.maxHits = maxHits;
		this.minTurns = minTurns;
		this.maxTurns = maxTurns;
		this.drain = drain;
		this.healing = healing;
		this.critRate = critRate;
		this.ailmentChance = ailmentChance;
		this.flinchChance = flinchChance;
		this.statChance = statChance;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}

	public Integer getMoveMetaCategoryId() {
		return moveMetaCategoryId;
	}

	public void setMoveMetaCategoryId(Integer moveMetaCategoryId) {
		this.moveMetaCategoryId = moveMetaCategoryId;
	}

	public Integer getMoveMetaAilmentId() {
		return moveMetaAilmentId;
	}

	public void setMoveMetaAilmentId(Integer moveMetaAilmentId) {
		this.moveMetaAilmentId = moveMetaAilmentId;
	}

	public Integer getMinHits() {
		return minHits;
	}

	public void setMinHits(Integer minHits) {
		this.minHits = minHits;
	}

	public Integer getMaxHits() {
		return maxHits;
	}

	public void setMaxHits(Integer maxHits) {
		this.maxHits = maxHits;
	}

	public Integer getMinTurns() {
		return minTurns;
	}

	public void setMinTurns(Integer minTurns) {
		this.minTurns = minTurns;
	}

	public Integer getMaxTurns() {
		return maxTurns;
	}

	public void setMaxTurns(Integer maxTurns) {
		this.maxTurns = maxTurns;
	}

	public Integer getDrain() {
		return drain;
	}

	public void setDrain(Integer drain) {
		this.drain = drain;
	}

	public Integer getHealing() {
		return healing;
	}

	public void setHealing(Integer healing) {
		this.healing = healing;
	}

	public Integer getCritRate() {
		return critRate;
	}

	public void setCritRate(Integer critRate) {
		this.critRate = critRate;
	}

	public Integer getAilmentChance() {
		return ailmentChance;
	}

	public void setAilmentChance(Integer ailmentChance) {
		this.ailmentChance = ailmentChance;
	}

	public Integer getFlinchChance() {
		return flinchChance;
	}

	public void setFlinchChance(Integer flinchChance) {
		this.flinchChance = flinchChance;
	}

	public Integer getStatChance() {
		return statChance;
	}

	public void setStatChance(Integer statChance) {
		this.statChance = statChance;
	}

	@Override
	public String toString() {
		return "MoveMeta [moveId=" + moveId + ", moveMetaCategoryId=" + moveMetaCategoryId + ", moveMetaAilmentId="
				+ moveMetaAilmentId + ", minHits=" + minHits + ", maxHits=" + maxHits + ", minTurns=" + minTurns
				+ ", maxTurns=" + maxTurns + ", drain=" + drain + ", healing=" + healing + ", critRate=" + critRate
				+ ", ailmentChance=" + ailmentChance + ", flinchChance=" + flinchChance + ", statChance=" + statChance
				+ "]";
	}
}