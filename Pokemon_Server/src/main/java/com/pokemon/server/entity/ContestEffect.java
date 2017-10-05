package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_contest_effects")
public class ContestEffect implements Serializable {
	private static final long serialVersionUID = 6579975135273990033L;

	@Id
	@Column(name = "contest_effect_id", unique = true, nullable = false)
	private Integer contestEffectId;

	@Column(name = "appeal")
	private Integer appeal;

	@Column(name = "jam")
	private Integer jam;

	@Column(name = "flavor_text")
	private String flavorText;

	@Column(name = "effect")
	private String effect;

	public ContestEffect() {
	}

	public ContestEffect(Integer contestEffectId, Integer appeal, Integer jam, String flavorText, String effect) {
		this.contestEffectId = contestEffectId;
		this.appeal = appeal;
		this.jam = jam;
		this.flavorText = flavorText;
		this.effect = effect;
	}

	public Integer getContestEffectId() {
		return contestEffectId;
	}

	public void setContestEffectId(Integer contestEffectId) {
		this.contestEffectId = contestEffectId;
	}

	public Integer getAppeal() {
		return appeal;
	}

	public void setAppeal(Integer appeal) {
		this.appeal = appeal;
	}

	public Integer getJam() {
		return jam;
	}

	public void setJam(Integer jam) {
		this.jam = jam;
	}

	public String getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	@Override
	public String toString() {
		return "ContestEffect [contestEffectId=" + contestEffectId + ", appeal=" + appeal + ", jam=" + jam
				+ ", flavorText=" + flavorText + ", effect=" + effect + "]";
	}
}