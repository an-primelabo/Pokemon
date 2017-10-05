package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_move_effects")
public class ConquestMoveEffect implements Serializable {
	private static final long serialVersionUID = 4525114239275016260L;

	@Id
	@Column(name = "conquest_move_effect_id", unique = true, nullable = false)
	private Integer conquestMoveEffectId;

	@Column(name = "short_effect")
	private String shortEffect;

	@Column(name = "effect")
	private String effect;

	public ConquestMoveEffect() {
	}

	public ConquestMoveEffect(Integer conquestMoveEffectId, String shortEffect, String effect) {
		this.conquestMoveEffectId = conquestMoveEffectId;
		this.shortEffect = shortEffect;
		this.effect = effect;
	}

	public Integer getConquestMoveEffectId() {
		return conquestMoveEffectId;
	}

	public void setConquestMoveEffectId(Integer conquestMoveEffectId) {
		this.conquestMoveEffectId = conquestMoveEffectId;
	}

	public String getShortEffect() {
		return shortEffect;
	}

	public void setShortEffect(String shortEffect) {
		this.shortEffect = shortEffect;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	@Override
	public String toString() {
		return "ConquestMoveEffect [conquestMoveEffectId=" + conquestMoveEffectId + ", shortEffect=" + shortEffect
				+ ", effect=" + effect + "]";
	}
}