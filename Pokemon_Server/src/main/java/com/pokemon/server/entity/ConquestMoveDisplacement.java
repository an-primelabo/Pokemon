package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_move_displacements")
public class ConquestMoveDisplacement implements Serializable {
	private static final long serialVersionUID = 7913406218017060183L;

	@Id
	@Column(name = "conquest_move_displacement_id", unique = true, nullable = false)
	private Integer conquestMoveDisplacementId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "affects_target")
	private Integer affectsTarget;

	@Column(name = "short_effect")
	private String shortEffect;

	@Column(name = "effect")
	private String effect;

	public ConquestMoveDisplacement() {
	}

	public ConquestMoveDisplacement(Integer conquestMoveDisplacementId, String name, String nameAlias,
			Integer affectsTarget, String shortEffect, String effect) {
		this.conquestMoveDisplacementId = conquestMoveDisplacementId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.affectsTarget = affectsTarget;
		this.shortEffect = shortEffect;
		this.effect = effect;
	}

	public Integer getConquestMoveDisplacementId() {
		return conquestMoveDisplacementId;
	}

	public void setConquestMoveDisplacementId(Integer conquestMoveDisplacementId) {
		this.conquestMoveDisplacementId = conquestMoveDisplacementId;
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

	public Integer getAffectsTarget() {
		return affectsTarget;
	}

	public void setAffectsTarget(Integer affectsTarget) {
		this.affectsTarget = affectsTarget;
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
		return "ConquestMoveDisplacement [conquestMoveDisplacementId=" + conquestMoveDisplacementId + ", name=" + name
				+ ", nameAlias=" + nameAlias + ", affectsTarget=" + affectsTarget + ", shortEffect=" + shortEffect
				+ ", effect=" + effect + "]";
	}
}