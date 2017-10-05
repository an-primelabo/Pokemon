package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_effects")
public class MoveEffect implements Serializable {
	private static final long serialVersionUID = -437176794146938212L;

	@Id
	@Column(name = "move_effect_id", unique = true, nullable = false)
	private Integer moveEffectId;

	@Column(name = "short_effect")
	private String shortEffect;

	@Column(name = "effect")
	private String effect;

	public MoveEffect() {
	}

	public MoveEffect(Integer moveEffectId, String shortEffect, String effect) {
		this.moveEffectId = moveEffectId;
		this.shortEffect = shortEffect;
		this.effect = effect;
	}

	public Integer getMoveEffectId() {
		return moveEffectId;
	}

	public void setMoveEffectId(Integer moveEffectId) {
		this.moveEffectId = moveEffectId;
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
		return "MoveEffect [moveEffectId=" + moveEffectId + ", shortEffect=" + shortEffect + ", effect=" + effect + "]";
	}
}