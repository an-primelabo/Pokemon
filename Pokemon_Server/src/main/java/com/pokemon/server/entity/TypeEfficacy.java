package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_type_efficacy")
public class TypeEfficacy implements Serializable {
	private static final long serialVersionUID = 7379936266071779970L;

	@Column(name = "damage_type_id")
	private Integer damageTypeId;

	@Column(name = "target_type_id")
	private Integer targetTypeId;

	@Column(name = "damage_factor")
	private Integer damageFactor;

	public TypeEfficacy() {
	}

	public TypeEfficacy(Integer damageTypeId, Integer targetTypeId, Integer damageFactor) {
		this.damageTypeId = damageTypeId;
		this.targetTypeId = targetTypeId;
		this.damageFactor = damageFactor;
	}

	public Integer getDamageTypeId() {
		return damageTypeId;
	}

	public void setDamageTypeId(Integer damageTypeId) {
		this.damageTypeId = damageTypeId;
	}

	public Integer getTargetTypeId() {
		return targetTypeId;
	}

	public void setTargetTypeId(Integer targetTypeId) {
		this.targetTypeId = targetTypeId;
	}

	public Integer getDamageFactor() {
		return damageFactor;
	}

	public void setDamageFactor(Integer damageFactor) {
		this.damageFactor = damageFactor;
	}

	@Override
	public String toString() {
		return "TypeEfficacy [damageTypeId=" + damageTypeId + ", targetTypeId=" + targetTypeId + ", damageFactor="
				+ damageFactor + "]";
	}
}