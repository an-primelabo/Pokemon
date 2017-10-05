package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_super_contest_effects")
public class SuperContestEffect implements Serializable {
	private static final long serialVersionUID = -3549744649112387344L;

	@Id
	@Column(name = "super_contest_effect_id", unique = true, nullable = false)
	private Integer superContestEffectId;

	@Column(name = "appeal")
	private Integer appeal;

	@Column(name = "flavor_text")
	private String flavorText;

	public SuperContestEffect() {
	}

	public SuperContestEffect(Integer superContestEffectId, Integer appeal, String flavorText) {
		this.superContestEffectId = superContestEffectId;
		this.appeal = appeal;
		this.flavorText = flavorText;
	}

	public Integer getSuperContestEffectId() {
		return superContestEffectId;
	}

	public void setSuperContestEffectId(Integer superContestEffectId) {
		this.superContestEffectId = superContestEffectId;
	}

	public Integer getAppeal() {
		return appeal;
	}

	public void setAppeal(Integer appeal) {
		this.appeal = appeal;
	}

	public String getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	@Override
	public String toString() {
		return "SuperContestEffect [superContestEffectId=" + superContestEffectId + ", appeal=" + appeal
				+ ", flavorText=" + flavorText + "]";
	}
}