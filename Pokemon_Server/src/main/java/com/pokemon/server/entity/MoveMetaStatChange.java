package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_meta_stat_changes")
public class MoveMetaStatChange implements Serializable {
	private static final long serialVersionUID = 5481560066147660544L;

	@Column(name = "move_id")
	private Integer moveId;

	@Column(name = "stat_id")
	private Integer statId;

	@Column(name = "change")
	private Integer change;

	public MoveMetaStatChange() {
	}

	public MoveMetaStatChange(Integer moveId, Integer statId, Integer change) {
		this.moveId = moveId;
		this.statId = statId;
		this.change = change;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}

	public Integer getStatId() {
		return statId;
	}

	public void setStatId(Integer statId) {
		this.statId = statId;
	}

	public Integer getChange() {
		return change;
	}

	public void setChange(Integer change) {
		this.change = change;
	}

	@Override
	public String toString() {
		return "MoveMetaStatChange [moveId=" + moveId + ", statId=" + statId + ", change=" + change + "]";
	}
}