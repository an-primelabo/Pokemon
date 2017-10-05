package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_experience")
public class Experience implements Serializable {
	private static final long serialVersionUID = -6283194333550654408L;

	@Column(name = "growth_rate_id")
	private Integer growthRateId;

	@Column(name = "level")
	private Integer level;

	@Column(name = "experience")
	private Integer experience;

	public Experience() {
	}

	public Experience(Integer growthRateId, Integer level, Integer experience) {
		this.growthRateId = growthRateId;
		this.level = level;
		this.experience = experience;
	}

	public Integer getGrowthRateId() {
		return growthRateId;
	}

	public void setGrowthRateId(Integer growthRateId) {
		this.growthRateId = growthRateId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Experience [growthRateId=" + growthRateId + ", level=" + level + ", experience=" + experience + "]";
	}
}