package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_nature_battle_style_preferences")
public class NatureBattleStylePreference implements Serializable {
	private static final long serialVersionUID = 1789015689342800960L;

	@Column(name = "nature_id")
	private Integer natureId;

	@Column(name = "move_battle_style_id")
	private Integer moveBattleStyleId;

	@Column(name = "low_hp_preference")
	private Integer lowHpPreference;

	@Column(name = "high_hp_preference")
	private Integer highHpPreference;

	public NatureBattleStylePreference() {
	}

	public NatureBattleStylePreference(Integer natureId, Integer moveBattleStyleId, Integer lowHpPreference,
			Integer highHpPreference) {
		this.natureId = natureId;
		this.moveBattleStyleId = moveBattleStyleId;
		this.lowHpPreference = lowHpPreference;
		this.highHpPreference = highHpPreference;
	}

	public Integer getNatureId() {
		return natureId;
	}

	public void setNatureId(Integer natureId) {
		this.natureId = natureId;
	}

	public Integer getMoveBattleStyleId() {
		return moveBattleStyleId;
	}

	public void setMoveBattleStyleId(Integer moveBattleStyleId) {
		this.moveBattleStyleId = moveBattleStyleId;
	}

	public Integer getLowHpPreference() {
		return lowHpPreference;
	}

	public void setLowHpPreference(Integer lowHpPreference) {
		this.lowHpPreference = lowHpPreference;
	}

	public Integer getHighHpPreference() {
		return highHpPreference;
	}

	public void setHighHpPreference(Integer highHpPreference) {
		this.highHpPreference = highHpPreference;
	}

	@Override
	public String toString() {
		return "NatureBattleStylePreference [natureId=" + natureId + ", moveBattleStyleId=" + moveBattleStyleId
				+ ", lowHpPreference=" + lowHpPreference + ", highHpPreference=" + highHpPreference + "]";
	}
}